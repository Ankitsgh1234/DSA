class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] diff=new int[m][n];
        int[] onei=new int[m];
        int[] onec=new int[n];
        int[] zeroi=new int[m];
        int[] zeroc=new int[n];
        for(int i=0;i<m;i++){
            int z=0;
            int o=0;
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    z++;
                }
                if(grid[i][j]==0){
                    o++;
                }
            }
            onei[i]=z;
            zeroi[i]=o;

        }
        for(int i=0;i<n;i++){
            int z=0;
            int o=0;
            for(int j=0;j<m;j++){
                if(grid[j][i]==0){
                    z++;
                }
                if(grid[j][i]==1){
                    o++;
                }
            }
            zeroc[i]=z;
            onec[i]=o;

        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                diff[i][j]=onei[i]+onec[j]-zeroi[i]-zeroc[j];
            }
        }
        return diff;
    }
}