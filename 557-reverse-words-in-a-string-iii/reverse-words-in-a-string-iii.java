class Solution {
    public String reverseWords(String s) {
        
        int i=0;
        int j=0;
        StringBuilder ans=new StringBuilder();
        int n=s.length();
        while(j<n){
            if(s.charAt(j)==' '){
                if (i < j) { 
                ans.append(reverse(s.substring(i,j)));
                ans.append(' ');
                }
                i=j+1;
                
            }
            j++;            
        }
        if(i<n)
        ans.append(reverse(s.substring(i,n)));
        //  if (ans.length() > 0 && ans.charAt(ans.length() - 1) == ' ') {
        //     ans.deleteCharAt(ans.length() - 1);
        // }

        return ans.toString();
        
        
    }
    public static String reverse(String sb){
        StringBuilder s=new StringBuilder(sb);
        return s.reverse().toString();
        
    }
}
