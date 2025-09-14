class Solution {
    public int earliestTime(int[][] tasks) {
        int n=tasks.length;
        int sum=0;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum=tasks[i][0]+tasks[i][1];
             
            max=Math.min(sum,max);
        }
        return max;
    }
}