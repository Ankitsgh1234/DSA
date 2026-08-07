class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int[][] arr= new int[n][n];
        int m=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=m++;
            }
        }
        int k=0;
        int l=0;
        int a=commands.size();
        for(int i=0;i<a;i++){
            String s=commands.get(i);
            if(s.equals("DOWN")){
                k++;
            }
            if(s.equals("UP")){
                k--;
            }
            if(s.equals("LEFT")){
                l--;
            }
            if(s.equals("RIGHT")){
                l++;
            }
        }
        return arr[k][l];
    }
}