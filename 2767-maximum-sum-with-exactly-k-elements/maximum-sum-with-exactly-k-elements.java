class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n=nums.length;
        // int dig=nums[n-1];
        int sum=0;
        int max=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }

        }
        for(int i=0;i<k;i++){
            sum=sum+max+i;
        }
        return sum;
    }
}