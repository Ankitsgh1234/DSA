class Solution {
    public boolean checkGoodInteger(int n) {
        return (square(n)-sum(n)>=50);
    }
    public int sum(int n){
        int sum=0;
        while(n!=0){
            sum+=(n%10);
            n=n/10;
        }
        return sum;
    }
    public int square(int n){
        int sum=0;
        while(n!=0){
            int d=n%10;

            sum+=d*d;
            n=n/10;
        }
        return sum;
    }
}