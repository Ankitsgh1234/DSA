class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c=0;
        long sum=0;
        for(int i=0;i<costs.length;i++){
            sum+=costs[i];
            if(sum<=(long)coins)c++;
        }
        return c;
    }
}