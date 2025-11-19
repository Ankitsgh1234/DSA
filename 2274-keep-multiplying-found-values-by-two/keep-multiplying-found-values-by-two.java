class Solution {
    public int findFinalValue(int[] nums, int original) {

        int n=nums.length;
        int i=0;
        boolean flag=true;
        while( i<=n-1){
            if(nums[i]==original){
                original*=2;
                i=0;
                flag =false;
                continue;
            }
            i++;
            
        }
        
            return original;
        
        
    }
}