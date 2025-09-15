class Solution {
    public int maxProduct(int[] nums) {
        int p=1;
        int n=nums.length;
        int maxp=Integer.MIN_VALUE;


        for(int i=0;i<n;i++){
            p=1;
            for(int j=i;j<n;j++){
                p*=nums[j];
                maxp=Math.max(maxp,p);

            }
        }
        return maxp;
        
    }
}