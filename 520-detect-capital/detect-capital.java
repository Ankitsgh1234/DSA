class Solution {
    public boolean detectCapitalUse(String word) {
        String s=word.substring(1,word.length());
        char ch=word.charAt(0);
        boolean u=false;
        boolean l=false;
        if(ch>='a'&&ch<='z'){
            l=true;
        }else{
            u=true;
        }
        boolean U=(s.equals(s.toUpperCase()));
        boolean L=(s.equals(s.toLowerCase()));
        System.out.println(l);
        System.out.println(l);
        if(L){
            return true;
        }
        if(U){
            if(u){
                return true;
            }else{
                return false;
            }
        }
        return U;
    }
}