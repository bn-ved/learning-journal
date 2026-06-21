# NeetCode 150 — Personalized Study Plan

**Goal:** Crack Google / big product-based companies (~7–8 month runway).
**Strengths:** Arrays, Hashing, Two Pointers. **Weak areas:** ⚠️ Trees, Graphs, DP.
**Order rationale:** warm up on strengths → climb the dependency ladder (Trees → Graphs → DP).

## How to use this file
- `[ ]` not started, `[x]` solved cleanly, `[~]` solved with help → **re-solve after 3–4 days**.
- Pace: **4–5/day** in strong phases, **2–3/day** in weak phases (Trees/Graphs/DP).
- Per problem: try ~25–30 min → study solution → **close it and re-code from scratch**.

## Mindset for weak areas
- **Trees** = recursion. Ask: *"what do I do at this node, what do I ask my children to return?"*
- **Graphs** = trees with cycles. Learn 3 templates: DFS, BFS, topological sort. Add a `visited` set.
- **DP** = recursion + memoization FIRST (top-down). Write brute-force recursion, then cache. Tables come after.

---

## Phase 1 — Warm-up (your strengths, go FAST) ~1 week

### Arrays & Hashing
- [x] Contains Duplicate
- [x] Valid Anagram
- [x] Two Sum
- [x] Group Anagrams
- [x] Top K Frequent Elements
- [x] Product of Array Except Self
- [x] Valid Sudoku
- [ ] Encode and Decode Strings
- [x] Longest Consecutive Sequence

### Two Pointers
- [x] Valid Palindrome
- [x] Two Sum II
- [x] 3Sum
- [x] Container With Most Water
- [ ] Trapping Rain Water

### Sliding Window
- [ ] Best Time to Buy and Sell Stock
- [ ] Longest Substring Without Repeating Characters
- [ ] Longest Repeating Character Replacement
- [ ] Permutation in String
- [ ] Minimum Window Substring
- [ ] Sliding Window Maximum

---

## Phase 2 — Stack + Binary Search (bridge) ~4–5 days

### Stack
- [ ] Valid Parentheses
- [ ] Min Stack
- [ ] Evaluate Reverse Polish Notation
- [ ] Generate Parentheses
- [ ] Daily Temperatures
- [ ] Car Fleet
- [ ] Largest Rectangle in Histogram

### Binary Search
- [ ] Binary Search
- [ ] Search a 2D Matrix
- [ ] Koko Eating Bananas
- [ ] Find Minimum in Rotated Sorted Array
- [ ] Search in Rotated Sorted Array
- [ ] Time Based Key-Value Store
- [ ] Median of Two Sorted Arrays

---

## Phase 3 — Linked List (pointer + recursion bridge into trees)
- [ ] Reverse Linked List
- [ ] Merge Two Sorted Lists
- [ ] Reorder List
- [ ] Remove Nth Node From End of List
- [ ] Copy List with Random Pointer
- [ ] Add Two Numbers
- [ ] Linked List Cycle
- [ ] Find the Duplicate Number
- [ ] LRU Cache
- [ ] Merge K Sorted Lists
- [ ] Reverse Nodes in K-Group

---

## Phase 4 — TREES ⚠️ (weak area #1 — slow down) 2–3/day

### Core recursion (node + children)
- [ ] Invert Binary Tree
- [ ] Maximum Depth of Binary Tree
- [ ] Diameter of Binary Tree
- [ ] Balanced Binary Tree
- [ ] Same Tree
- [ ] Subtree of Another Tree
- [ ] Lowest Common Ancestor of a BST

### BFS + DFS-with-state (preps graphs)
- [ ] Binary Tree Level Order Traversal
- [ ] Binary Tree Right Side View
- [ ] Count Good Nodes in Binary Tree

### Harder recursion
- [ ] Validate Binary Search Tree
- [ ] Kth Smallest Element in a BST
- [ ] Construct Binary Tree from Preorder and Inorder Traversal

### Hardest (revisit after a day's gap)
- [ ] Binary Tree Maximum Path Sum
- [ ] Serialize and Deserialize Binary Tree

### Tries (trees with letters)
- [ ] Implement Trie (Prefix Tree)
- [ ] Design Add and Search Words Data Structure
- [ ] Word Search II

---

## Phase 5 — Heap / Priority Queue
- [ ] Kth Largest Element in a Stream
- [ ] Last Stone Weight
- [ ] K Closest Points to Origin
- [ ] Kth Largest Element in an Array
- [ ] Task Scheduler
- [ ] Design Twitter
- [ ] Find Median from Data Stream

---

## Phase 6 — Backtracking (DP on-ramp — don't skip)
- [ ] Subsets
- [ ] Combination Sum
- [ ] Permutations
- [ ] Subsets II
- [ ] Combination Sum II
- [ ] Word Search
- [ ] Palindrome Partitioning
- [ ] Letter Combinations of a Phone Number
- [ ] N-Queens

---

## Phase 7 — GRAPHS ⚠️ (weak area #2) 2–3/day

### Core (grid DFS/BFS + topological sort)
- [ ] Number of Islands
- [ ] Max Area of Island
- [ ] Clone Graph
- [ ] Walls and Gates
- [ ] Rotting Oranges
- [ ] Pacific Atlantic Water Flow
- [ ] Surrounded Regions
- [ ] Course Schedule          ← topological sort (learn this template)
- [ ] Course Schedule II       ← topological sort
- [ ] Graph Valid Tree
- [ ] Number of Connected Components in an Undirected Graph
- [ ] Redundant Connection
- [ ] Word Ladder

### Advanced Graphs (lower priority — do after DP if time allows)
- [ ] Reconstruct Itinerary
- [ ] Min Cost to Connect All Points
- [ ] Network Delay Time
- [ ] Swim in Rising Water
- [ ] Alien Dictionary
- [ ] Cheapest Flights Within K Stops

---

## Phase 8 — DP ⚠️ (weak area #3 — finale; recursion+memo FIRST) 2–3/day

### 1-D DP
- [ ] Climbing Stairs
- [ ] Min Cost Climbing Stairs
- [ ] House Robber
- [ ] House Robber II
- [ ] Longest Palindromic Substring
- [ ] Palindromic Substrings
- [ ] Decode Ways
- [ ] Coin Change
- [ ] Maximum Product Subarray
- [ ] Word Break
- [ ] Longest Increasing Subsequence
- [ ] Partition Equal Subset Sum

### 2-D DP
- [ ] Unique Paths
- [ ] Longest Common Subsequence
- [ ] Best Time to Buy and Sell Stock with Cooldown
- [ ] Coin Change II
- [ ] Target Sum
- [ ] Interleaving String
- [ ] Longest Increasing Path in a Matrix
- [ ] Distinct Subsequences
- [ ] Edit Distance
- [ ] Burst Balloons             ← brutal, don't let it block you
- [ ] Regular Expression Matching ← brutal, don't let it block you

---

## Phase 9 — Cleanup (sprinkle between heavy phases as breathers)

### Greedy
- [ ] Maximum Subarray
- [ ] Jump Game
- [ ] Jump Game II
- [ ] Gas Station
- [ ] Hand of Straights
- [ ] Merge Triplets to Form Target Triplet
- [ ] Partition Labels
- [ ] Valid Parenthesis String

### Intervals
- [ ] Insert Interval
- [ ] Merge Intervals
- [ ] Non-overlapping Intervals
- [ ] Meeting Rooms
- [ ] Meeting Rooms II
- [ ] Minimum Interval to Include Each Query

### Math & Geometry
- [ ] Rotate Image
- [ ] Spiral Matrix
- [ ] Set Matrix Zeroes
- [ ] Happy Number
- [ ] Plus One
- [ ] Pow(x, n)
- [ ] Multiply Strings
- [ ] Detect Squares

### Bit Manipulation
- [ ] Single Number
- [ ] Number of 1 Bits
- [ ] Counting Bits
- [ ] Reverse Bits
- [ ] Missing Number
- [ ] Sum of Two Integers
- [ ] Reverse Integer

---

## Re-solve queue (move `[~]` problems here, clear after re-solving)
-
