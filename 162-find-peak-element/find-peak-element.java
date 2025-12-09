class Solution {
    public int findPeakElement(int[] nums) {
        long max=Integer.MIN_VALUE;
        int ind=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                ind=i;
            }

        }
        return ind;
    }
}