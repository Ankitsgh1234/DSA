class Solution {
    public int minimumCost(int[] nums) {
        int n=nums.length;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int m=0;
        // int n=0;
        for(int i=1;i<n;i++){
            if(min1>nums[i]){
                min1=nums[i];
                m=i;
            }
        }
        for(int i=1;i<n;i++){
            if(i!=m && min2>nums[i]){
                min2=nums[i];
            }
        }
        return nums[0]+min1+min2;
    }
}