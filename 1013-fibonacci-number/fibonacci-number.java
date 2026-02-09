class Solution {
    static int[] dp;
    public static int fibo(int n){
        if(n<=1){
            return n;
        }
        dp[0]=0;
        dp[1]=1;
        
        if(dp[n]!=0){
            return dp[n];
        }
        return dp[n]=fibo(n-1)+fibo(n-2);
    }
    public int fib(int n) {
        
        dp=new int[n+1];
       return fibo(n);
       
    }
}