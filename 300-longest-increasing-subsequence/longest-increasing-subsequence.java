class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        int max=0;
        dp[0]=1;
        for(int i=0;i<n;i++){
            max=0;
            for(int j=i-1;j>=0;j--){
                if(nums[i]>nums[j]){
                    max=Math.max(max,dp[j]);
                }
            }
            dp[i]=1+max;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
}