class Solution {
    public boolean isTrionic(int[] nums) {
        boolean inc1=false;
        boolean dec1=false;
        boolean inc2=false;
        boolean dec2=false;
        int n=nums.length;

        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                return false;
            }
            if(nums[i]<nums[i+1]){
                inc1=true;
            }
            if(nums[i]>nums[i+1]&&inc1==true){
                dec1=true;
            }
            if(nums[i]>nums[i+1]&&inc1==false){
                return false;
                // dec1=true;
            }
            if(nums[i]<nums[i+1]&&inc1==true&&dec1==true){
                inc2=true;
            }
            if(nums[i]>nums[i+1]&&inc1==true&&dec1==true&&inc2==true){
               return false;
            }
        }
        if(inc1==true&&inc2==true&&dec1==true){
            return true;
        }
        return false;
    }
}