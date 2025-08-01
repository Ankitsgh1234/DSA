import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int smallest = 1;
        for (int num : nums) {
            if (num == smallest) {
                smallest++;
            }
        }
        return smallest;
    }
}
