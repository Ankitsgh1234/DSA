class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                l=i;
                return i;
            }
            else if(nums[i]<target){
                l=i+1;
            }
            else{
                break;
            }
        }
        return l;

        
    }
}