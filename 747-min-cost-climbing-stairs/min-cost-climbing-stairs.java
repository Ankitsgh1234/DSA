class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n+1];
        // dp[0]=cost[0];
        // dp[1]=cost[1];
        // for(int i=2;i<n;i++){
        //     dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        // }
        // return Math.min(dp[n-1],dp[n-2]);


        // Method-2
        dp[n-1]=cost[n-1];
        dp[n-2]=cost[n-2];
        for(int i=n-3;i>=0;i--){
            dp[i]=cost[i]+Math.min(dp[i+1],dp[i+2]);
        }
        return Math.min(dp[1],dp[0]);
    }
    // public static int mincost(int[] cost,int i,int[] dp){
    //     int n=cost.length;
    //     if(i>n){
    //         return dp[n];
    //     }
    //     return dp[i]=cost[i]+Math.min()
    // }
}