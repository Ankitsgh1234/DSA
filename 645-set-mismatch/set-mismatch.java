class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        Set<Integer> seen = new HashSet<>();
        int duplicate = 0;

        for (int num : nums) {
            if (seen.contains(num)) {
                duplicate = num;
            } else {
                seen.add(num);
                actualSum += num;
            }
        }

        int missing = expectedSum - actualSum;
        return new int[]{duplicate, missing};
    }
}
