class Solution {
    public int countSquares(int[][] arr) {
        int c=0;
        int m=arr.length;
        int n=arr[0].length;

        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            dp[i][0]=arr[i][0];
        }
        for(int i=0;i<n;i++){
            dp[0][i]=arr[0][i];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(arr[i][j]==0)continue;
                dp[i][j]=1+Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]));
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                c+=dp[i][j];
            }
        }
        return c;


    }
}