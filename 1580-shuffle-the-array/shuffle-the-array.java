class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] nuearr=new int[nums.length];
        int i=0;
        int j=nums.length/2;
        int k=0;
        for(int m=0;m<nums.length;m++){
            if(k%2==0){
                nuearr[k]=nums[i++];
            }
            else{
                nuearr[k]=nums[j++];
            }
            
            k++;
        }
        return  nuearr;
        
    }
}