class Solution {
    public boolean isPalindrome(int x) {
int n=x;
        int rev=0;
        while(x>0){
            int digit=x%10;
            rev=10*rev+digit;
            x=x/10;
        }
        if(rev==n){
            return true;
        }
        else return false;
        
    }
}