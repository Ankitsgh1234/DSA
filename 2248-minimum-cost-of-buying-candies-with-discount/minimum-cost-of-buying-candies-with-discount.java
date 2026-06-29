class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int sum = 0;
        for (int x : cost) {
            sum += x;
        }

        int free = 0;
        for (int i = cost.length - 3; i >= 0; i -= 3) {
            free += cost[i];
        }

        return sum - free;
    }
}