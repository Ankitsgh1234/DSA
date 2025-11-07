class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // buy at lowest
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // sell at max profit
            }
        }

        return maxProfit;
    }
}
