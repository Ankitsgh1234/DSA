class Solution {
    public String capitalizeTitle(String title) {
        String s = title.toLowerCase();
        int n = s.length();

        // Capitalize first word if its length > 2
        int end = s.indexOf(' ');
        if (end == -1) end = n;
        if (end > 2) {
            s = s.substring(0, 1).toUpperCase() + s.substring(1);
        }

        int i = 0;
        while (i < n) {
            if (s.charAt(i) == ' ') {
                int start = i + 1;
                int j = start;

                while (j < n && s.charAt(j) != ' ') j++;

                if (j - start > 2) {
                    s = s.substring(0, start)
                      + s.substring(start, start + 1).toUpperCase()
                      + s.substring(start + 1);
                }
            }
            i++;
        }

        return s;
    }
}