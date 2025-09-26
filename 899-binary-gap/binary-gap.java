class Solution {
    public int binaryGap(int n) {
        int max=0;
        int curr=0;
        while((n&1)!=1){
            n=n>>1;

        }
        while(n>0){
            if((n&1)==0){
                curr++;
            }
            else if((n&1)==1){
                max=Math.max(curr,max);
                curr=1;
            }
            n=n>>1;

        }
        return max;
        
    }
}