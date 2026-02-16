class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];

        boolean even=true;
        if(n%2!=0){
            even =false;
        }
       

        int k=0;
        for(int i=1;i<=n/2;i++){
            arr[k++]=i;
            arr[k++]=-i;
        }
        
        if(even ==false){
            arr[k]=0;
        }
        return arr;
        
    }
}