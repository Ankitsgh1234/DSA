class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return way(0,nums,target);
    }
    public static int way(int i,int[] arr,int target){
        if(i==arr.length){
            if(target==0){
                return 1;
            }
            else return 0;
        }
        return way(i+1,arr,target+arr[i])+way(i+1,arr,target-arr[i]);
    }
}