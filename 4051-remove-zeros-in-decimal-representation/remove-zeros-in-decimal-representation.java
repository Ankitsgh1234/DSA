class Solution {
    public long removeZeros(long n) {
        long ans=0;
        while(n!=0){
            if(n%10==0){
                n=n/10;
                continue;
            }else{
                ans=ans*10;
                ans+=n%10;
                n=n/10;
            }
        }
        long a=0;
        while(ans!=0){
            a=a*10;
            a+=(ans%10);
            ans=ans/10;
        }
        return a;
    }
}