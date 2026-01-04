class Solution {
    public int sumFourDivisors(int[] nums) {
        int out = 0;

        for (int i = 0; i < nums.length; i++) {
            int digit = nums[i];
            int sum = 0;
            int c = 0;
            int j = 1;

            while (j * j <= digit) {
                if (digit % j == 0) {
                    int d1 = j;
                    int d2 = digit / j;

                    if (d1 == d2) {   // perfect square
                        c++;
                        sum += d1;
                    } else {
                        c += 2;
                        sum += d1 + d2;
                    }
                }
                j++;
            }

            if (c == 4) {
                out += sum;
            }
        }
        return out;
    }
}
