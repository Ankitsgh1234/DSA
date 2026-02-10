class Solution {
    public int uniquePaths(int m, int n) {
        if(m==1&&n==1){
            return 1;
        }
        int [][] dp=new int[m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return path(m,n,0,1,dp)+path(m,n,1,0,dp);
    }
    public static int path(int m,int n,int i,int j,int[][] dp){
        if(i==m-1&&j==n-1){
            return 1;
        }
        if(i==m){
            return 0;
        }
        if(j==n){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        return dp[i][j]= path(m,n,i+1,j,dp)+path(m,n,i,j+1,dp);
    }
}