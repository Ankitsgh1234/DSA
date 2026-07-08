class Solution {
    public int smallestAbsent(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        int sum = 0;

        for (int x : nums) {
            sum += x;
            set.add(x);
        }

        double avg = (double) sum / nums.length;

        int ans = Math.max(1, (int) Math.floor(avg) + 1);

        while (set.contains(ans)) {
            ans++;
        }

        return ans;
    }
}