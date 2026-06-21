void main() {
    int[] nums = { 1, 2, 3, 1 };
    System.out.println(containsDuplicate(nums));
}

public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
        if (set.contains(num)) {
            return true;
        }
        set.add(num);
    }
    return false;
}
