class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int sum=0;
        for(int i=1;i<n;i++){
            sum+=Math.abs(nums[i]-nums[0]);
        }
        arr[0]=sum;
        for(int i=1;i<n;i++){
            int dif=nums[i]-nums[i-1];
            int e=n-i;
            arr[i]=arr[i-1]+((i*dif)-(e*dif));
        }
        return arr;
    }
}