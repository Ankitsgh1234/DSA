class Solution {
    public boolean kLengthApart(int[] nums, int k) {
    int i = 0;
        while (i < nums.length && nums[i] != 1) {
            i++;
        }
        for (int j = i + 1; j < nums.length; j++) {

            if (nums[j] == 1) {
                int gap = j - i - 1;

                if (gap < k) return false;

                i = j; 
            }
        }

        return true;
}}