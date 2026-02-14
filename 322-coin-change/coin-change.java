class Solution {

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];

        // initialize dp with -1
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        int ans = solve(coins, n - 1, amount, dp);

        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }

    private int solve(int[] coins, int i, int amount, int[][] dp) {

        // base case: amount formed
        if (amount == 0) return 0;

        // no coins left
        if (i < 0) return Integer.MAX_VALUE;

        if (dp[i][amount] != -1) return dp[i][amount];

        // not pick
        int notPick = solve(coins, i - 1, amount, dp);

        // pick (unbounded → stay at same index)
        int pick = Integer.MAX_VALUE;
        if (coins[i] <= amount) {
            int res = solve(coins, i, amount - coins[i], dp);
            if (res != Integer.MAX_VALUE) {
                pick = 1 + res;   // safe from overflow
            }
        }

        return dp[i][amount] = Math.min(pick, notPick);
    }
}
