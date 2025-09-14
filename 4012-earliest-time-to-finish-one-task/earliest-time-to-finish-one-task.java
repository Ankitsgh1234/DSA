class Solution {
    public int earliestTime(int[][] tasks) {
        int n=tasks.length;
        int sum=0;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=0;j<2;j++){
                sum+=tasks[i][j];

            }
            max=Math.min(sum,max);
        }
        return max;
    }
}