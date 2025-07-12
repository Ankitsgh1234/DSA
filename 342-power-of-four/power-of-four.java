class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        double logVal = Math.log10(n) / Math.log10(4);
        return logVal == Math.floor(logVal);
    }
}
