class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=nums[i];

        }
        int[] arr=new int[n];
        int left=0;
        int right=sum;
        for(int i=0;i<n;i++){
            right-=nums[i];
            int digit=Math.abs(left-right);
            left+=nums[i];
            // digit-=nums[i];
            arr[i]=digit;

        }
        return arr;
        
    }
}