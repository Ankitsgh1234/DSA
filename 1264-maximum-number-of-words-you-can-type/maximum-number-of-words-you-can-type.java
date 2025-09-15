class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0;
        boolean flag=true;
        int n=text.length();
        Set<Character> st=new HashSet<>();

        for(char ch : brokenLetters.toCharArray()){
            st.add(ch);
        }
        for(int i=0;i<n;i++){
            flag=true;

            while(i<n&&text.charAt(i)!=' '){
                if(st.contains(text.charAt(i))){
                    flag=false;
                }
                i++;
            }
            if(flag){
                count++;
            }

        }
        return count;


        
    }
}