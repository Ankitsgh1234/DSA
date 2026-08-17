class Solution {
    public List<String> stringSequence(String target) {
        List<String> lt = new ArrayList<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < target.length(); i++) {

            ans.append('a');
            lt.add(ans.toString());
            while(target.charAt(i)!=ans.charAt(i)){
                char ch=(char)(ans.charAt(i)+1);
                ans.setCharAt(i,ch);
                lt.add(ans.toString());
            }
        }
        

        return lt;
    }
}