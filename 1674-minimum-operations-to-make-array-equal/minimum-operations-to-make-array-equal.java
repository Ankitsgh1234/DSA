class Solution {
    public int minOperations(int n) {
        int c=0;
        int i=1;
        if(n%2==0){
        while(i<n){
            c+=i;
            i+=2;
        }
        }else{
            i=2;
            while(i<n){
                c+=i;
                i+=2;
            }
        }
        return c;
    }
}