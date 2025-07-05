class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] p=new int[nums.length/2];
        int[] n=new int[nums.length/2];
        int x=0;
        int y=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                p[x]=nums[i];
                x++;
            }
            else{
                n[y]=nums[i];
                y++;
            }
        }
        x=0;
        y=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=p[x];
                x++;
            }
            else{
                nums[i]=n[y];
                y++;
            }
        }
        return nums;
    }
}