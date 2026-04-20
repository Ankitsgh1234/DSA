class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int max=0;
        for(int i=0;i<n;i++){
            int m=0;
            for(int j=n-1;j>=i+1;j--){
                if(colors[i]!=colors[j]){
                    m=Math.abs(i-j);
                    max=Math.max(max,m);
                }
            }
        }
        return max;
    }
}