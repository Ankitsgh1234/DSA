class Solution {
    public int findDuplicate(int[] nums) {
       
        int i=0;
        int n=nums.length;
        while(i<n){
            if(nums[i]==i)i++;
            else{
                int idx=nums[i];
                if(nums[idx]==idx)return idx;
                swap(nums,i,idx);
            }
        }
        return -1;
    }
    public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    }
}