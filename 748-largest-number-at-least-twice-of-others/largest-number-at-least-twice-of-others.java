class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int index = 0;
        int smax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                smax = max;  
                max = nums[i];
                index = i;
            } else if (nums[i] > smax && nums[i] < max) {
                smax = nums[i];
            }

        }
        if (smax * 2 <= max) {
             
            return index;

        } else {
            return -1;
        }
    }
}