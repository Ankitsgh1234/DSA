class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            int d=nums[i];
            int sum=0;
            while(d!=0){
                sum+=d%10;
                d=d/10;
            }
            arr[i]=sum;
        }
        Arrays.sort(arr);
        return arr[0];
    }
}