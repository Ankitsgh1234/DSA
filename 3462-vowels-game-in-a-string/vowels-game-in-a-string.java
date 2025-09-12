class Solution {
    public boolean doesAliceWin(String s) {
        int vov=0;
        
        for(char ch:s.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vov++;
            }
        }
        if(vov==0){
            return false;
        }
        else if(vov%2!=2){
            return true;
        }
        else{
            return false;
        }
        
    }
}