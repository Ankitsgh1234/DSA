class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zero++;
            }
        }

        if (zero == 0) {
            int product = 1;
            for (int i = 0; i < n; i++) {
                product *= nums[i];
            }
            for (int i = 0; i < n; i++) {
                int digit=nums[i];
                nums[i]=product/digit;
            }
            return nums;


        }
        else if (zero ==1) {
            int product = 1;
            for (int i = 0; i < n; i++) {
                if(nums[i]!=0){

                product *= nums[i];
                }
            }
            for (int i = 0; i < n; i++) {
                int digit=nums[i];
                if(digit==0){

                nums[i]=product;
                }
                else{
                    nums[i]=0;
                }
            }
            return nums;
        }
            else{
                 for (int i = 0; i < n; i++) {
                nums[i]=0;
            
            }
            return nums;


        }
        
    }
}