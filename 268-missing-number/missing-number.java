class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n){
            if(nums[i]==i||nums[i]==n)i++;
            else{
                int idx=nums[i];
                // if(idx>=n){
                //     continue;
                // }
                swap(nums,i,idx);
            }
        }
        for(i=0;i<n;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return n;
    }
    public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
}