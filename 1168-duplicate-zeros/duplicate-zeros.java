class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                shift(arr,i);
                // arr[i+1]=0;
                i++;
            }
        }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }

    }
    public static void shift(int[] arr,int i){
        int n=arr.length;
        for(int j=n-1;j>i;j--){
            arr[j]=arr[j-1];
        }
        
    }
}