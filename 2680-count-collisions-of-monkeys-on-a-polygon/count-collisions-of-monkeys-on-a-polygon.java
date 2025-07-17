class Solution {
int mod = 1000000007;

int mpow(int x, int y) {
    int res = 1;
    while (y > 0) {
        if ((y & 1) != 0) { // if y is odd
            res = (int)((long)res * x % mod);
        }
        x = (int)((long)x * x % mod);
        y /= 2;
    }
    return res;
}

int monkeyMove(int n) {
    return (mpow(2, n) - 2 + mod) % mod;
}

     
}