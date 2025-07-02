import java.util.*;

class Solution {
    public String findValidPair(String s) {
        // Step 1: Count frequency of each digit using HashMap
        Map<Integer, Integer> mp = new HashMap<>();

        for (char d : s.toCharArray()) {
            int digit = d - '0';
            mp.put(digit, mp.getOrDefault(digit, 0) + 1);
        }

        // Step 2: Check adjacent digits in the string
        for (int i = 0; i < s.length() - 1; i++) {
            int a = s.charAt(i) - '0';
            int b = s.charAt(i + 1) - '0';

            if (a != b && mp.get(a) == a && mp.get(b) == b) {
                // return first valid adjacent pair
                return "" + s.charAt(i) + s.charAt(i + 1);
            }
        }

        return ""; // No valid pair found
    }
}
