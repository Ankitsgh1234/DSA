class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> map=new HashSet<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(map.contains(ch)){
                return ch;
            }
            map.add(ch);
        }
        
        return 'a';
    }
}