class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(nums[i])) {
                int z = m.get(nums[i]);
                if (Math.abs(i - z) <= k) {
                    return true;
                }
            }
            m.put(nums[i], i); // store value → index
        }

        return false;
    }
}
