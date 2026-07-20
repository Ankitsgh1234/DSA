class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);

        int i = 0;
        int j = sb.length() - 1;

        while (i < j) {
            char chi = sb.charAt(i);
            char chj = sb.charAt(j);

            if (isVowel(chi) && isVowel(chj)) {
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            } 
            else if (!isVowel(chi)) {
                i++;
            } 
            else {
                j--;
            }
        }

        return sb.toString();
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}