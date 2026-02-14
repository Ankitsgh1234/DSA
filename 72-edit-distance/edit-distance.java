class Solution {
    public int minDistance(String s1, String s2) {
        int m =s1.length();
        int n =s2.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0){
                    if(j==0){

                    dp[i][j]=i;
                    }
                    else{
                        dp[i][j]=j;
                    }
                    continue;
                }
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                 dp[i][j]= dp[i-1][j-1];
                }
                else{
                    int a=dp[i-1][j];
                    int b=dp[i][j-1];
                    int c=dp[i-1][j-1];
                    dp[i][j]=1+ Math.min(a,Math.min(b,c));
                }
            }

        }
        return dp[m][n];
        // return edit(m-1,n-1,word1,word2,dp);
    }
    // public static int edit(int m,int n,String s1,String s2,int[][]dp){
    //     if(m<0&&n<0){
    //         return 0;
    //     }
    //     if(m<0){
    //         return n+1;
    //     }
    //     if(n<0){
    //         return m+1;
    //     }
    //     if(dp[m][n]!=-1){
    //         return dp[m][n];
    //     }
    //     if(s1.charAt(m)==s2.charAt(n)){
    //         return dp[m][n]= edit(m-1,n-1,s1,s2,dp);
    //     }
    //     int op1=1+edit(m,n-1,s1,s2,dp);
    //     int op2=1+edit(m-1,n,s1,s2,dp);
    //     int op3=1+edit(m-1,n-1,s1,s2,dp);
    //     return dp[m][n]= Math.min(op1,Math.min(op3,op2));
    // }
}