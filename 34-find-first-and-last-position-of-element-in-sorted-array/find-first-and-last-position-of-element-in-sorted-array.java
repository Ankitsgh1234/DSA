class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int s=0;
        int e=nums.length;
       
        int[] arr={-1,-1};

        for(int i=0;i<e;i++){
           
            if(nums[i]==target&&i!=0&&nums[i-1]!=target){
                arr[0]=i;
            }
            if(nums[0]==target){
                arr[0]=0;
            }
            
            
            if(nums[i]==target&&i!=e-1&&nums[i+1]!=target){
                arr[1]=i;
            }
            if(nums[e-1]==target){
                arr[1]=e-1;
            }
            

        }
        return arr;
    }
}