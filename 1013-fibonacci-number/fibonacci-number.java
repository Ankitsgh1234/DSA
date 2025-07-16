class Solution {
    public int fibbn(int m){
        if(m==0) return 0;
        if(m==1||m==2){
            return 1;
        }
        return fibbn(m-1)+fibbn(m-2);
    }

    public int fib(int n) {

        return fibbn(n);
                  
    }
}