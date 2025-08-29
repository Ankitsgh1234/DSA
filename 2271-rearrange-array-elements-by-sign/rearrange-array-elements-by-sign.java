class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] positive=new int[nums.length/2];
        int[] negative=new int[nums.length/2];
        int k=0;
        int m=0;
        for(int i:nums){
            if(i>00){
                positive[k++]=i;
            }
            else
            negative[m++]=i;
        }
        k=0;
        m=0;
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
             if(i%2==0){
                arr[i]=positive[k++];
             }
             else{
                arr[i]=negative[m++];
             }

        }
        return arr;
        
    }
}