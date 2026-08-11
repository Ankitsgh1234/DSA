class Solution {
    public int monotoneIncreasingDigits(int n) {
        char[] a = String.valueOf(n).toCharArray();

        int i = 1;

        while (i < a.length && a[i] >= a[i - 1]) {
            i++;
        }

        if (i == a.length)
            return n;

        while (i > 0 && a[i] < a[i - 1]) {
            a[i - 1]--;
            i--;
        }

        for (int j = i + 1; j < a.length; j++) {
            a[j] = '9';
        }

        return Integer.parseInt(new String(a));
    }
}