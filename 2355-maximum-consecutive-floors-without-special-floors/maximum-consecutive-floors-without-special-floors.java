class Solution {
    public int maxConsecutive(int bottom, int top, int[] arr) {
        int c=0;
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
            c=arr[i]-arr[i-1]-1;
            max=Math.max(max,c);
        }
        max=Math.max(arr[0]-bottom,max);
        max=Math.max(top-arr[n-1],max);
        return max;

    }
}