class Solution {
    public int maximumCount(int[] nums) {
        int negtive=0;
        int positive=0;
        for (int num:nums){
            if(num<0){
                negtive++;
            }
            if(num>0){
                positive++;
            }
        }
        if(positive>negtive){
            return positive;
        }
        else{
            return negtive;
        }

        
    }
}