class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=0;
        int m=0;
        if (nums.length % 2 == 0) {
             n = nums.length / 2;
              m = nums.length / 2;

        } else {
             n = nums.length / 2 + 1;
             m = nums.length / 2;

        }
        int[] even = new int[n];
        int[] odd = new int[m];
        int x = 0;
        int y = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even[x] = nums[i];
                x++;

            } else {
                odd[y] = nums[i];
                y++;
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        // Arrays.sort(odd, Collections.reverseOrder());
       for (int i = 0; i < odd.length / 2; i++) {
            int temp = odd[i];
            odd[i] = odd[odd.length - 1 - i];
            odd[odd.length - 1 - i] = temp;
        }
        x=0;
        y=0;

        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=even[x++];
            }
            else{
                nums[i]=odd[y++];
            }
        }
        return nums;

    }
}