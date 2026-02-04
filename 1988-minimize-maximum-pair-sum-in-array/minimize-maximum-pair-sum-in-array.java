class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int[] arr=new int[n/2];
        int k=0;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int sum=nums[i]+nums[j];
            i++;
            j--;
            arr[k++]=sum;
        }
        int max=0;
        for( i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        return max;
    }
}