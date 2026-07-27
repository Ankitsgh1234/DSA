class Solution {
    public long maxProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        long ans1 = 1L * nums[0] * nums[1] * 100000;
        long ans2 = 1L * nums[n - 1] * nums[n - 2] * 100000;
        long ans3 = 1L * nums[0] * nums[n - 1] * (-100000);

        return Math.max(ans1, Math.max(ans2, ans3));
    }
}