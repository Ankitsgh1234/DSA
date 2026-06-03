class Solution {
    public boolean checkString(String s) {
        int c=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a'){
                c++;
            }
        }
        int k=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='b'&&k<c){
                return false;
            }
            else{
                k++;
            }
        }
        return true;
    }
}