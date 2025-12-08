class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];

        int prev2 = nums[0];                        // dp[i-2]
        int prev1 = Math.max(nums[0], nums[1]);    // dp[i-1]

        for (int i = 2; i < nums.length; i++) {
            int pick = prev2 + nums[i];            // choose this house
            int notPick = prev1;                   // skip this house

            int curr = Math.max(pick, notPick);

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}
