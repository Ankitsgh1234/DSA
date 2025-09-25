class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        if(nums[0]<=nums[n-1]){
            for(int i=0;i<n-1;i++){
                if(nums[i]<=nums[i+1]){
                    continue;
                }
                else{
                    return false;
                }
            }
            return true;
        }
        if(nums[0]>=nums[n-1]){
            for(int i=0;i<n-1;i++){
                if(nums[i]>=nums[i+1]){
                    continue;
                }
                else{
                   return  false;
                }
            }
            return true;
        }
        return false;
        
    }
}