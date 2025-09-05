class Solution {
    public void setZeroes(int[][] matrix) {
        int  m= matrix.length;
        int n = matrix[0].length;
         
        int[][] nm=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                  nm[i][j]=-1;
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                     
                    int l=0;
                    int k=0;
                     while(l<n)
                     {
                        nm[i][l]=0;
                        l++;

                     }
                     while(k<m)
                     {
                        nm[k][j]=0;
                        k++;

                     }

                }
                else if (nm[i][j]==-1){
                    nm[i][j]=matrix[i][j];
                }
                 
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]= nm[i][j];
            }
        }
        
    }
}