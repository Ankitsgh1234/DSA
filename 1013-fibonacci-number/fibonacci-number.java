class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int fib=0;
        int i=2;
        int one=1;
        int zero=0;
        int three=0;
        while(i<=n){
            three=one+zero;
            zero=one;
            one=three;
            i++;
            
        }
        return three;
    }
}