class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();

        for (int i=0;i<order.length(); i++) {
            char ch = order.charAt(i);

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    sb.append(ch);
                }
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (!order.contains(s.charAt(i) + "")) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}