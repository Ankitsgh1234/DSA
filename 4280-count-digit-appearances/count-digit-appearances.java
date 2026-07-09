class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n=nums.length;
        int i=0;
        int k=0;
        while(i<n){
            int d=nums[i];
            while(d!=0){
                if(d%10==digit){
                    k++;
                }
                d=d/10;
            }
            i++;
        }
        return k;
    }
}