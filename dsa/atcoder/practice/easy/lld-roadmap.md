# LLD Mastery — 1 Month Roadmap (Java)

> Goal: Go from "I know OOP" to "I can design clean, extensible class structures and machine-code a working solution in 60–90 min" — the actual product-company interview bar.
>
> **Owner:** Ved · **Start date:** 2026-06-21 · **Review date:** 2026-07-21
>
> **The drill for every problem:**
> 1. Spend 5–10 min writing **requirements + clarifying questions** (treat me/yourself as the interviewer).
> 2. Identify **entities → classes → interfaces → relationships** on paper first.
> 3. Code a **working, runnable** version in Java (with a `main` that demos it).
> 4. Ask: *"What if we add feature X?"* — your design should bend, not break.
> 5. Note time taken + what you'd improve. Target: under 90 min by Week 4.

---

## Week 1 — Foundations (don't skip; this is the multiplier)

The mistake everyone makes: jumping to "design a parking lot" without the vocabulary. Code **every** item below as a tiny runnable Java program — not just read it.

### SOLID (refactor, don't memorize)
- [ ] **S**ingle Responsibility — take one of your old bloated classes, split it
- [ ] **O**pen/Closed — add a feature via extension, not modification
- [ ] **L**iskov Substitution — break it on purpose (Square/Rectangle), then fix
- [ ] **I**nterface Segregation — split a fat interface
- [ ] **D**ependency Inversion — inject an abstraction, swap two implementations

### Design Patterns (8 that matter most — code each)
- [ ] **Strategy** — payment methods (Card/UPI/Wallet)
- [ ] **Factory / Factory Method** — notification channel creator
- [ ] **Builder** — build a complex `Pizza` / `HttpRequest`
- [ ] **Singleton** — thread-safe config manager (do it right: enum or double-checked lock)
- [ ] **Observer** — event subscribers (stock price → subscribers)
- [ ] **Decorator** — coffee + add-ons pricing
- [ ] **State** — vending machine / traffic light states
- [ ] **Adapter** — adapt a 3rd-party logger to your interface

### Concurrency basics (backend interviews probe this)
- [ ] `synchronized` vs `ReentrantLock` — code a thread-safe counter both ways
- [ ] Producer–Consumer with `BlockingQueue`
- [ ] Thread-safe Singleton — prove it with a multi-thread test

**Week 1 review checkpoint:** Can you explain each SOLID letter with *your own* code example? Can you name when to reach for each pattern?

---

## Week 2 — Easy → Medium machine-coding (build the muscle)

One problem every 1–2 days. Working code + demo `main` each time.

- [ ] **1. Parking Lot** — multiple floors, slot types (bike/car/truck), pricing strategy, find-nearest-slot
  - Stretch: multiple entry/exit gates, ticketing
- [ ] **2. Tic-Tac-Toe** — generic NxN, pluggable win-detection, 2 players
  - Stretch: make it work for Connect-4 with minimal change (tests your abstraction)
- [ ] **3. Vending Machine** — State pattern (Idle/HasMoney/Dispensing), inventory, change return
- [ ] **4. LRU Cache** — `get`/`put` in O(1) (HashMap + doubly linked list), then add TTL
  - Stretch: make it thread-safe; then generic + pluggable eviction (LRU/LFU/FIFO)
- [ ] **5. Logging Framework** — levels, multiple appenders (console/file), Chain of Responsibility
- [ ] **6. Rate Limiter** — Token Bucket + Sliding Window, per-user, thread-safe
  - This bridges into HLD — keep your notes

**Week 2 review checkpoint:** Did any design "break" when you added the stretch feature? That's the lesson — note which principle would've prevented it.

---

## Week 3 — Medium → Hard (real interview territory)

These have richer domains and more entities. Push to finish in ~90 min.

- [ ] **7. Splitwise** — users, groups, expenses, equal/exact/percentage splits, balance sheet, simplify-debts
- [ ] **8. Elevator System** — multiple elevators, scheduling strategy (pluggable), direction logic
- [ ] **9. Snake & Ladder** — board, dice strategy, multiple players, configurable snakes/ladders
- [ ] **10. Chess** — pieces (polymorphic move validation), board, turn management, check/checkmate
- [ ] **11. BookMyShow / Movie Booking** — theatres, shows, seats, **concurrent booking** (locking!), payment
- [ ] **12. Notification System** — Email/SMS/Push channels, Observer + Factory, retry, user prefs
- [ ] **13. Online Food Delivery (Zomato-lite)** — restaurants, menu, cart, order state machine, delivery assignment
- [ ] **14. Library Management** — books, members, issue/return, fines, search by author/title

**Week 3 review checkpoint:** Pick your two messiest designs and refactor them. Refactoring *your own* code is where the deep learning happens.

---

## Week 4 — Hard + concurrency-heavy + interview conditions

Strict 90-min timebox, no looking up patterns mid-solve. Simulate the real thing.

- [ ] **15. Inventory Management System** — SKUs, warehouses, stock movements, thresholds, suppliers
- [ ] **16. Cab Booking (Uber-lite)** — riders, drivers, matching strategy, surge pricing, trip state machine
- [ ] **17. Stock Exchange / Order Matching Engine** — buy/sell orders, matching by price-time priority
- [ ] **18. Concurrent Hash Map (mini)** — segment locking, resize — deepens your Java internals
- [ ] **19. Distributed ID Generator (Snowflake-style)** — design the class, reason about uniqueness/ordering
- [ ] **20. Meeting Room Scheduler / Calendar** — rooms, conflict detection, recurring events

### Bonus pool (if you're hungry — you said you're ready for all of them)
- [ ] **21. ATM Machine** — State pattern, card/PIN/dispense flow
- [ ] **22. Card Game (Blackjack/Poker)** — deck, hand evaluation, rules engine
- [ ] **23. Music Player / Spotify-lite** — playlists, queue, shuffle/repeat strategies
- [ ] **24. URL Shortener (LLD side)** — encoding, collision handling, storage interface
- [ ] **25. File System (in-memory)** — files/dirs (Composite pattern), path resolution
- [ ] **26. Text Editor with Undo/Redo** — Command + Memento patterns
- [ ] **27. Pub-Sub / Message Broker (in-memory)** — topics, subscribers, offset tracking
- [ ] **28. Coupon / Discount Engine** — stackable rules, Strategy + Chain of Responsibility

---

## Recurring questions to ask yourself on EVERY problem
- What are the **core entities**, and what behavior belongs to each? (avoid anemic models)
- Where will **change** come from? Put an interface there.
- Is there **shared mutable state**? → concurrency strategy.
- Am I violating SRP? (a class doing 3 things = 3 classes)
- Could I swap an implementation without touching callers? (DIP test)
- What **design pattern** naturally fits — and am I forcing one that doesn't?

## Resources
- *Head First Design Patterns* (Java, hands-on)
- refactoring.guru (patterns + examples, free)
- YouTube: ConceptAndCoding (Shrayansh) — Java LLD; Gaurav Sen — design intuition
- Practice format reference: search "<problem> machine coding round"

## End-of-month review (we do this together on 2026-07-21)
- [ ] Count problems completed / 28
- [ ] List 3 designs you're proud of + 3 you'd redo
- [ ] Which patterns now feel *natural* vs still forced?
- [ ] Average time on a medium problem — under 90 min?
- [ ] Gaps to carry into the HLD month
