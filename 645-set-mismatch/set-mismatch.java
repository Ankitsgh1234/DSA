import java.util.*;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        int n = nums.length;

        long total = (long)n * (n + 1) / 2;  
        long sum = 0;

        Arrays.sort(nums);

        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                arr[0] = nums[i];   // duplicate
            }
            sum += nums[i];
        }

        arr[1] = (int)(arr[0] + (total - sum)); // missing
        return arr;
    }
}
