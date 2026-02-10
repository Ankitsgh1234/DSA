class Solution {
    public int maximalSquare(char[][] matrix) {
        int c=0;
        int m=matrix.length;
        int n=matrix[0].length;

        int[][] dp=new int[m][n];
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=(matrix[i][j]-'0');
            }
        }

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
        int max=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                max=Math.max(max,dp[i][j]);
            }
        }
        return max*max;
    }
}