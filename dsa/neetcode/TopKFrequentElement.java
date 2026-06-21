void main() {

}

public int[] topKFrequent(int[] nums, int k) {
    Queue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt((int[] a) -> a[1]).reversed());
    Map<Integer, Integer> map = new HashMap<>();

    for (int num : nums) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    map.forEach((a, b) -> {
        queue.offer(new int[] { a, b });
    });

    int[] ans = new int[k];
    for (int i = 0; i < k; i++) {
        ans[i] = queue.poll()[0];
    }

    return ans;

}
