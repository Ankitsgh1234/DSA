class Solution {
    public int subarrayLCM(int[] nums, int k) {
           int c = 0;

        for (int i = 0; i < nums.length; i++) {

            int g = 1;

            for (int j = i; j < nums.length; j++) {

                g = lcm(g, nums[j]);

                if (g == k) {
                    c++;
                }
                if(g>k){
                    break;
                }
            }
        }

        return c;
    }
    public int lcm(int a,int b){
        return (a / gcd(a, b)) * b;
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}