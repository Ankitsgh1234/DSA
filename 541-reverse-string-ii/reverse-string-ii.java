class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();
        int i = 0;
        StringBuilder ans = new StringBuilder();

        while (i < n) {

            int end = Math.min(i + k, n);
            String nw = s.substring(i, end);
            ans.append(rev(nw));
            i = end;
            
            if (i < n) {
                int nextEnd = Math.min(i + k, n);
                ans.append(s.substring(i, nextEnd));
                i = nextEnd;
            }
        }

        return ans.toString();
    }

    public static String rev(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}