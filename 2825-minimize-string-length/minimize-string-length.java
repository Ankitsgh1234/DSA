class Solution {
    public int minimizedStringLength(String s) {
        // int[] arr=new int[26];
        int n=s.length();
        // for(int i=0;i<n;i++){
        //     arr[s.charAt(i)-'a']++;
        // }
        // int c=0;
        // for(int i=0;i<26;i++){
        //     if(arr[i]!=0)c++;
        // }
        // return c;


        Set<Character> st=new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(s.charAt(i));
        }
        return st.size();
    }
}