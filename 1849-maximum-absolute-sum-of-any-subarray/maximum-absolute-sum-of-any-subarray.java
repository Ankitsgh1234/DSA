class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int a=nums[0];
        int b=nums[0];
        int ans=nums[0];
        if(nums.length==1){
            return Math.abs(nums[0]);
        }
        for(int i=1;i<nums.length;i++){
            a=Math.max(nums[i],nums[i]+a);
            b=Math.min(nums[i],nums[i]+b);
            ans=Math.max(ans,Math.max(Math.abs(a),Math.abs(b)));
        }
        return ans;
    }
}