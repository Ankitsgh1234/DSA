class Solution {
    public int numSquares(int n) {
        int[] dp=new int[n+1];

        for(int i=1;i<=n;i++){
            if(isPrefect(i)){
                dp[i]=1;
            }
            else{
                int min=Integer.MAX_VALUE;
                
                for(int j=1;j*j<=i;j++){
                    int c=dp[j*j]+dp[i-j*j];
                    min=Math.min(c,min);
                }
                dp[i]=min;

            }
        }
        return dp[n];
    }
    public static boolean isPrefect(int n){
        int s=(int)Math.sqrt(n);
        return (s*s==n);
    }
}