class Solution {
    public int pivotInteger(int n) {
        long S = (long) n * (n + 1) / 2;   
        long x = (long) Math.sqrt(S);
        if (x * x == S) {
            return (int) x;
        } else {
            return -1;
        }
    }
}
