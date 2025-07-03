class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] nw=new int[nums.length];
        int i = 0;
         
        int k=0;
        int m=nums.length-1;
        while (i < nums.length) {
            if (nums[i] % 2 == 0) {
                nw[k]=nums[i];
                k++;
            } else {
                nw[m]=nums[i];
                m--;                 
                 
                   }
                   i++;
        }
        return nw;

    }
}