class Solution {
    public int reverse(int x) {
        int reverce=0;
        while(x!=0){
            int r=x%10;
            if(reverce>Integer.MAX_VALUE/10||reverce<Integer.MIN_VALUE/10){
                return 0;
            }
            
            reverce=reverce*10+r;
            x=x/10;
        }
        return reverce;
        
    }
}