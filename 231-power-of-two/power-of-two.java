class Solution {
    public boolean isPowerOfTwo(int n) {

        // int m=1;
        // while(m<=n){
        //     if(m==n){
        //         return true;
        //     }
        //     m=m<<1;
        // }
        // return false;

        int c=0;
        while(n!=0){
            if((n&1)==1){
                c++;
            }
            if(c>1){
                return false;
            }
           n= n>>1;
        }
        if(c==1){
            return true;
        }
        else return false;
        
    }
}