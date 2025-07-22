class Solution {
    public int minMaxGame(int[] nums) {
        while(nums.length>1){
            int j=0;
            int[] newnum=new int[nums.length/2];
            for(int i=0;i<nums.length;i+=2){
                if(j%2==0){
                newnum[j]=Math.min(nums[i],nums[i+1]);

                }
                else{
                     newnum[j]=Math.max(nums[i],nums[i+1]);

                }
                j++;
            } 
            nums=newnum; 

        }
        return nums[0];
    }
}