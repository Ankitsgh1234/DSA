class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[n-1];
        int k=1;
        int ans=1;
        while(k<=a){
            if(a%k==0&&b%k==0){
                ans=k;
            }
            k++;
        }
        return ans;

    }
}