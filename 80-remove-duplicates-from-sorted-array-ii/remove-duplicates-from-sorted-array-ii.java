class Solution {
    public int removeDuplicates(int[] nums) {
        // boolean f1=false;
        // int n=nums.length;
        // int c=0;
        //     c=1;
        //     int j=0;
        // for(int i=0;i<n;i++){
        //     j=i-1;
        //     while(true){
        //         if(i>=0&&arr[i]==arr[j]&&c<2){
        //             break;
        //         }else if(i>=0;arr[i]==arr[j]&&c>=2){
        //             arr[i]=Integer.MaxValue;
        //             break;
        //         }else if(i>=0&&arr[j]==Integer.MAX_VALUE&&arr[j-1]==arr[i]){
        //             arr[j]=Integer.MAX_VALUE;
        //             break;
        //             // j--;
        //         }
        //     }
        // }


        int n=nums.length;
        int[] arr=new int[n];
        int c=0;
        arr[0]=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                arr[i]=nums[i];
                c=0;
            }else{
                c++;
                if(c<2){
                    arr[i]=nums[i];
                }else{
                    arr[i]=Integer.MAX_VALUE;
                }
            }
        }
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]==Integer.MAX_VALUE){
                continue;
            }
            nums[k++]=arr[i];
        }
        return k;
    }
}