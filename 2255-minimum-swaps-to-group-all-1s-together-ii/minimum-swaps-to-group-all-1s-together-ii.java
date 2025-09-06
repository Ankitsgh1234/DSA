class Solution {
    public int minSwaps(int[] nums) {
        int one=0;
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
            }
        }
        int curzero=0;

        for(int i=0;i<count;i++){
            if(nums[i]==0){
                curzero++;
            }
            
        }
        int minzero=curzero;
        int start=0;
        int end=count-1;

        while(start<n){
            if(nums[start]==0){
                curzero--;
            }
            start++;
            end++;
            if(nums[end%n]==0){
                curzero++;
            }
            minzero=Math.min(minzero,curzero);
        }
        return minzero;
        
    }
}