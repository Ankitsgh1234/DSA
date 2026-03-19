class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        int c=0;
        dp[0][0]=grid[0][0];
        if(grid[0][0]<=k){
            c++;
        }
        for(int i=1;i<n;i++){
            dp[0][i]=dp[0][i-1]+grid[0][i];
            if(dp[0][i]<=k){
                c++;
            }
        }
        System.out.println(c);
        for(int i=1;i<m;i++){
            dp[i][0]=dp[i-1][0]+grid[i][0];
            if(dp[i][0]<=k){
                c++;
            }
        }
        System.out.println(c);
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1]+grid[i][j];
                if(dp[i][j]<=k){
                    c++;
                }
            }
        }
        return c;
    }
}