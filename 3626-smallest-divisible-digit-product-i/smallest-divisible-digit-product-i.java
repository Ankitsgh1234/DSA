class Solution {
    public int smallestNumber(int n, int t) {
        int c=n;
        while(true){
            if(p(c)%t==0){ 
                break;          
            }
            c++;
        }
        return c;
    }
    public static int p(int n){
        int c=1;
        while(n!=0){
            c=c*(n%10);
            n=n/10;

        }
        return c;
    }
}