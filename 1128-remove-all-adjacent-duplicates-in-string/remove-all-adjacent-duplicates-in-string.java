class Solution {
    public String removeDuplicates(String s) {
      
        Stack<Character> st = new Stack<>();
        st.push('0');
        for (char c : s.toCharArray()) {
            if (c == st.peek()) {
                st.pop();
            } else {
                st.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        System.out.println(st);
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.reverse().toString();
    }
}