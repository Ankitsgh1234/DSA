class Solution {

    public String shortestCommonSupersequence(String str1, String str2) {
        String lcs = longestCommonSubsequence(str1, str2);
        int i = 0, j = 0, k = 0;
        StringBuilder ans = new StringBuilder();
        while (k < lcs.length()) {
            while (i < str1.length() && str1.charAt(i) != lcs.charAt(k)) {
                ans.append(str1.charAt(i));
                i++;
            }

            // Add from str2 until we reach current LCS char
            while (j < str2.length() && str2.charAt(j) != lcs.charAt(k)) {
                ans.append(str2.charAt(j));   // FIXED (was wrong before)
                j++;
            }

            // Add the LCS character once
            ans.append(lcs.charAt(k));
            i++;
            j++;
            k++;
        }

        // Add remaining characters
        while (i < str1.length()) {
            ans.append(str1.charAt(i));
            i++;
        }

        while (j < str2.length()) {
            ans.append(str2.charAt(j));
            j++;
        }

        return ans.toString();
    }


    // Proper LCS (fixed backtracking logic)
    public static String longestCommonSubsequence(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        // Build DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        // Backtrack to build LCS string
        int i = m, j = n;
        StringBuilder sb = new StringBuilder();

        while (i > 0 && j > 0) {

            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                sb.append(s1.charAt(i - 1));
                i--;
                j--;
            }
            else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            }
            else {
                j--;
            }
        }

        return sb.reverse().toString();
    }
}
