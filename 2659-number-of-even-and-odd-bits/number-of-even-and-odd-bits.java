class Solution {
    public int[] evenOddBit(int n) {
        int[] evodd=new int[2];
        int i=0;
        while(n>0){
            if((n&1)==1){
                if(i%2==0){
                    evodd[0]++;
                }
                else{
                    evodd[1]++;
                }

            }
            n=n>>1;
            i++;

        }
        return evodd;
    }
}