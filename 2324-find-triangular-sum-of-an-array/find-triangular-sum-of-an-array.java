class Solution {
    public int triangularSum(int[] nums) {
        int[] x = getIt(nums);
        return x[0]; 
    }

    public int[] getIt(int[] arr) {
        while (arr.length > 1) {
            int[] temp = new int[arr.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = (arr[i] + arr[i + 1]) % 10;
            }
            arr = temp; 
        }
        return arr; 
    }
}
