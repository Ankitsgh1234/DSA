class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n =nums.length;
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            int num=nums[i];
            int sum=0;
            for(int j=0;j<n;j++){
                if(i!=j&&num>nums[j]){
                    sum++;
                }
            }
            arr[i]=sum;
        }
        return arr;

    }
}