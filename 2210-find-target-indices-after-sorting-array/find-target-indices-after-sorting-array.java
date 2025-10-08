class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> arr=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                arr.add(i);
            }
        }

        return arr;
        
    }
}