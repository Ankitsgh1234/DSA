class Solution {
    public int numSpecial(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[] row=new int[m];
        int[] col=new int[n];
        for(int i=0;i<m;i++){
            int o=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    o++;
                }
            }
            row[i]=o;

        }
        for(int i=0;i<n;i++){
            int o=0;
            for(int j=0;j<m;j++){
                if(mat[j][i]==1){
                    o++;
                }
            }
            col[i]=o;

        }
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    if(row[i]==1&&col[j]==1){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}