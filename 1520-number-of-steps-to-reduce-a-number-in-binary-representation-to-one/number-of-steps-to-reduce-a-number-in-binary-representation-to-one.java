class Solution {
    public int numSteps(String s) {
        int n = s.length();
        int c = 0;
        int carry = 0;

        for (int i = n - 1; i > 0; i--) {
            int bit = s.charAt(i) - '0';
            int value = bit + carry;

            if (value == 1) {   // odd
                c += 2;
                carry = 1;
            } else {            // even
                c += 1;
            }
        }

        return c + carry;
    }
}