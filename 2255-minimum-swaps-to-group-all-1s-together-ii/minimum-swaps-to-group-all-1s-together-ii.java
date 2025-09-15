class Solution {
    public int minSwaps(int[] nums) {
        int ws=0;
        int n=nums.length;

        for (int i=0;i<n;i++){
            if(nums[i]==1){
                ws++;
            }
        }
        int zero=0;
        int mz=Integer.MAX_VALUE;
        for(int i=0;i<ws;i++){
            if(nums[i]==0){
                zero++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zero--;

            }
            if(nums[(i+ws)%n]==0){
                zero++;
            }
            mz=Math.min(zero,mz);
        }
        return mz;

        
    }
}