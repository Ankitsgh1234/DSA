class Solution {
    public int minimumOperations(int[] nums) {
        int count =0;
        int len=nums.length;
        for(int i: nums){
            if(i%3==0){
                count++;
            }
        }
        return len-count;


        
    }
}