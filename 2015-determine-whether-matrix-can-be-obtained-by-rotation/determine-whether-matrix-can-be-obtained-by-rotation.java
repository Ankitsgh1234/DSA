class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int m=mat.length;
        int n=mat[0].length;
        int p=0;
        boolean flag=true;
        while(p<=3){
        int[][] arr=new int[m][n];
            flag=true;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr[j][n-1-i]=mat[i][j];
                }
            }
            mat=arr;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(mat[i][j]!=target[i][j]){
                        flag=false;
                        break;
                    }

                }
                if(!flag){
                    break;
                }
            }
            if(flag){
                return true;
            }
            p++;
            
        }
        return false;
       
    }
}