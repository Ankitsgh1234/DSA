class Solution {
    public int minimumSwaps(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                c++;
            }
        }
        int x=0;
        for(int i=n-1;i>=n-c;i--){
            if(nums[i]==0){
                x++;
            }
        }
        return c-x;
    }
}