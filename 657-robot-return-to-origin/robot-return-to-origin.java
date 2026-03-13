class Solution {
    public boolean judgeCircle(String moves) {
        int upd=0;
        int lr=0;
        int n=moves.length();
        for(int i=0;i<n;i++){
            if(moves.charAt(i)=='U'){
                upd++;
            }
            else if(moves.charAt(i)=='D'){
                upd--;
            }
            else if(moves.charAt(i)=='R'){
                lr++;
            }else{
                lr--;
            }
        }
        if(lr==0&&upd==0){
            return true;
        }
        else{
            return false;
        }
    }
}