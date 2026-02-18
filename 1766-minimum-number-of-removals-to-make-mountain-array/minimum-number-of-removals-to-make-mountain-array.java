class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] dp1 = new int[n];
        int max = 0;
        dp1[0] = 1;
        for (int i = 0; i < n; i++) {
            max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    max = Math.max(max, dp1[j]);
                }
            }
            dp1[i] = 1 + max;
        }
        int[] dp2 = new int[n];
        max = 0;
        dp2[0] = 1;
        for (int i = n - 1; i >= 0; i--) {
            max = 0;
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    max = Math.max(max, dp2[j]);
                }
            }
            dp2[i] = 1 + max;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(dp1[i]>1&&dp2[i]>1)
            ans = Math.max(ans, dp1[i] + dp2[i] - 1);
        }
        System.out.println(ans);
        
        if (ans < 3) {
            return 0;
        } else
            return n-ans;
    }
}