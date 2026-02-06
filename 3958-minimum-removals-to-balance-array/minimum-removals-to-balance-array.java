class Solution {
    public int minRemoval(int[] nums, int k) {
        int n=nums.length;
        if(n<=1){
            return 0;
        }
       
        Arrays.sort(nums);
        int i=0;
        int j=1;
        int c=1;
        int c2=0;
        int max=0;
        while(j<n){
           if((long)nums[j]<=(long)nums[i]*k){
            j++;
            c++;
           max=Math.max(c,max);
           }
           else{
            c--;
            i++;
           }
        }
       

        return n-max;
    }
}