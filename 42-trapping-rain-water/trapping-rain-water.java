class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] rmax=new int[n];
        int[] arr=new int[n];
        int[] lmax=new int[n];
        int max=height[0];
        // Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            max=Math.max(height[i],max);
            lmax[i]=max;
        }
        max=height[n-1];
        for(int i=n-1;i>=0;i--){
            max=Math.max(height[i],max);
            rmax[i]=max;
        }
        for(int i=0;i<n;i++){
            int min=Math.min(lmax[i],rmax[i]);
            arr[i]=min-height[i];
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
}