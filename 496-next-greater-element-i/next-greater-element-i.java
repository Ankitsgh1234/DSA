class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int num=nums1[i];
            int j=0;
            while(nums2[j]!=num){
                j++;
            }
            while(j<m){
                if(nums2[j]>num){
                    arr[i]=nums2[j];
                    break;
                }
                j++;
                    arr[i]=-1;
            }
        }
        return arr;
    }
}