class Solution {
    public String greatestLetter(String s) {
        int[] lc=new int[26];
        int[] uc=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z'){
                lc[ch-'a']++;
            }
            if(ch>='A'&&ch<='Z'){
                uc[ch-'A']++;
            }
        }
        String ans="";
        for(int i=25;i>=0;i--){
            if(lc[i]!=0&&uc[i]!=0){
                int k=i+65;
                ans=(char)k+"";
                break;
            }
        }
        return ans;
    }
}