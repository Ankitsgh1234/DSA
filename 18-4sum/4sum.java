import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums); 
        Set<List<Integer>> res = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Long> st = new HashSet<>();  

                for (int k = j + 1; k < n; k++) {
                    long sum = (long) nums[i] + nums[j] + nums[k];
                    long need = (long) target - sum;

                    if (st.contains(need)) {
                         
                        if (need >= Integer.MIN_VALUE && need <= Integer.MAX_VALUE) {
                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], (int) need);
                            Collections.sort(temp);
                            res.add(temp);
                        }
                    }
                    st.add((long) nums[k]);  
                }
            }
        }

        return new ArrayList<>(res);
    }
}
