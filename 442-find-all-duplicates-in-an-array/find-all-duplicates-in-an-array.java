class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> lt=new ArrayList<>();

        int n=nums.length;
        for(int i=0;i<n;i++){
            int idx=nums[i];
            if(nums[Math.abs(idx)-1]<0){
                lt.add(Math.abs(nums[i]));
            }
            idx=Math.abs(idx);
            nums[idx-1]=-nums[idx-1];
        }
       
        return lt;
    }
}