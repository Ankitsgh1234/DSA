class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();

        int[][] dp=new int[m+1][n+1];

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                    
                }
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        

        return dp[m][n];
        
    }
    // public static int lcs(int m,int n,String s1,String s2,int[][] dp){
    //     if(n==-1||m==-1){
    //         return 0;
    //     }
    //     if(dp[m][n]!=-1){
    //         return dp[m][n];
    //     }
    //     if(s1.charAt(m)==s2.charAt(n)){
    //         return dp[m][n]= 1+lcs(m-1,n-1,s1,s2,dp);
    //     }
    //     return dp[m][n]= Math.max( lcs(m-1,n,s1,s2,dp),lcs(m,n-1,s1,s2,dp));

    // }
}