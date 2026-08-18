class Solution {
    public int numberOfSpecialChars(String word) {
        int i=0;
        int n=word.length();
        int[] lc=new int[26];
        int[] fc=new int[26];
        int ans=0;
        Arrays.fill(lc,-1);
        Arrays.fill(fc,-1);

        while(i<n){
            char c=word.charAt(i);
           if(c>='a'&&c<='z'){
            lc[c-'a']=i;
           }else{
            if(fc[c-'A']==-1){
                fc[c-'A']=i;
            }
           }
           i++;
        }
        for(i=0;i<26;i++){
            if(lc[i]!=-1&&fc[i]!=-1&&lc[i]<fc[i]){
                ans++;
            }
        }
        return ans;
    }
}