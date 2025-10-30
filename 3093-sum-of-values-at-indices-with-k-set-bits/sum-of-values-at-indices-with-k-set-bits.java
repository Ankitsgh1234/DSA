class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        int n=nums.size();
         int[] arr=new int[n];

        if(n==0){
            return 0;
        }
        arr[0]=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i]=arr[i/2];
            }
            else{
                arr[i]=arr[i/2]+1;
            }
            if(arr[i]==k)
            sum=sum+nums.get(i);
        }
        return sum;
        
    }
}