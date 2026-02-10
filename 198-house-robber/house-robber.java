class Solution {
    public int rob(int[] nums) {

        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }

        int[] dp=new int[n+1];

        dp[0]=nums[0];
        dp[1]=Math.max(nums[1],nums[0]);

        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],nums[i]+dp[i-2]);
        }
        return dp[n-1];
      
        
        // return robb(nums,0);
    }
    // public static int robb(int [] arr,int i){
    //     int n=arr.length;
    //     if(i>=n){
    //         return 0 ;
    //     }
    //     int op1=0+robb(arr,i+1);
    //     int op2=arr[i]+robb(arr,i+2);

    //     return Math.max(op1,op2);

    // }
}