class Solution {
    public int[] xorQueries(int[] arr, int[][] q) {
        int n=arr.length;
        int[] xor= new int[n+1];
        for(int i=0;i<n;i++){
            xor[i+1]=xor[i]^arr[i];
        }
        int[] ans=new int[q.length];
        for(int i=0;i<q.length;i++){
            int l=q[i][0];
            int r=q[i][1];
            ans[i]=xor[r+1]^xor[l];
        }
        return ans;
    }
}