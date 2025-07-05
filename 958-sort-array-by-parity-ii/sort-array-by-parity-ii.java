class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        // List<Integer> even=new ArrayList<>();
        // List<Integer> odd=new ArrayList<>();
        int[] even =new int[nums.length/2];
        int[] odd =new int[nums.length/2];
        int x=0;
        int y=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even[x]=nums[i];
                x++;
            }
            else {
                odd[y]=nums[i];
                y++;
            }
        }
        x=0;
        y=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
             nums[i]=even[x];
             x++;
            }
            else
            {
                nums[i]=odd[y];
                y++;
            }
        }
        return nums;

        
    }
}