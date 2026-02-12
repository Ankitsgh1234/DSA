class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2!=0){
            return false;
        }
        Boolean [][] dp=new Boolean[nums.length][sum/2+1];
        return subset(0,nums,sum/2,dp);
    }
    public static boolean subset(int i,int[] arr,int n,Boolean[][] dp){
        if(i==arr.length){
            if(n==0){
                return true;
            }
            else return false;
        }
        if(n>=0&&dp[i][n]!=null){
            return dp[i][n];
        }
        dp[i][n]= subset(i+1, arr, n,dp);
        if(arr[i]<=n)
        return dp[i][n]=dp[i][n]||subset(i+1 ,arr, n-arr[i],dp);
        return dp[i][n];
        
    }
}