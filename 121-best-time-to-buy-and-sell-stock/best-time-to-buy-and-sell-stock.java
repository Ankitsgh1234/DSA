class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int sum=0;
        int n=prices.length;

        for(int i=0;i<n;i++){
            int cost=prices[i]-min;
            sum=Math.max(sum,cost);
            min=Math.min(prices[i],min);

        }
        return sum;
        
    }
}