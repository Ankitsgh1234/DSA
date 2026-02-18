class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        dp[0]=1;
        int max=0;
        for(int i=0;i<n;i++){
            max=0;
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i]){
                    max=Math.max(dp[j],max);
                }
            }
            dp[i]=1+max;
        }
        for(int i=0;i<n;i++){
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}