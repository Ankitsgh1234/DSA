import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int n = nums.length;
        int nbt = n / 3;  // floor division is enough

        for (int i = 0; i < n; i++) {
            int c = nums[i];
            int count = 1;

            // count occurrences of nums[i]
            for (int j = i + 1; j < n; j++) {
                if (nums[j] == c) {
                    count++;
                }
            }

            // check if > n/3 and not already in list
            if (count > nbt && !arr.contains(c)) {
                arr.add(c);
            }
        }

        return arr;
    }
}
