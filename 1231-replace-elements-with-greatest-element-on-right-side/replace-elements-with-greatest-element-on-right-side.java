class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            int m=0;
            for(int j=i+1;j<n;j++){
                m=Math.max(m,arr[j]);
            }
            arr[i]=m;
        }
        arr[n-1]=-1;
        return arr;
    }
}