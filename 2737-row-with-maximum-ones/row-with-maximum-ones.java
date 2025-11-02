class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int [] arr=new int[2];
        int ind=0;
        int max=0;
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0; j<mat[0].length;j++){

            if(mat[i][j]==1){
                sum++;
            }
        }
        if(sum>max){
            max=sum;
            ind=i;
            }
        }
        arr[0]=ind;
        arr[1]=max;
        return arr;
    }
}