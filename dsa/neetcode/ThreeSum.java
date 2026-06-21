void main() {

}

public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);

    List<List<Integer>> ans = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
        // remove the outer duplicate
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
        }
        int left = i + 1, right = nums.length - 1;
        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];
            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                ans.add(List.of(nums[i], nums[left], nums[right]));
                left++;
                right--;

                // remove the outer duplicate
                while (left < right && nums[left - 1] == nums[left]) {
                    left++;
                }
                while (left < right && nums[right + 1] == nums[right]) {
                    right--;
                }
            }
        }
    }
    return ans;
}
