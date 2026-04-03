class Solution {
    static int count;
    public int reversePairs(int[] nums) {
    
        count=0;
        merge(nums);
        return count;
        
       
    }
      public static void merge(int[] arr) {
        int n = arr.length;
        if(n==1){
            return;
        }
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        int k = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[k];
            k++;
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[k];
            k++;
        }

        merge(a);
        merge(b);
        inversion(a,b);
        concure(a, b, arr);

    }
    public static void inversion(int[] a,int[]b){
        int n = 0;
        int m = 0;
        int i = 0;
        while (m < a.length && n < b.length) {
           
                if((long)a[m]>((long)(2*(long)b[n]))){
                    count+=(a.length-m);
                    n++;
                }else{
                    m++;
                }
                
            
        }
    }
    private static void concure(int[] a, int[] b, int[] arr) {

        int n = 0;
        int m = 0;
        int i = 0;
        while (m < a.length && n < b.length) {
            if (a[m] <= b[n]) {
                arr[i++] = a[m];
                m++;
            } else {
                // if(a[m]>2*b[n])
                // count+=(a.length-m);
                arr[i++] = b[n];
                n++;
            }
        }
        while (m < a.length) {
            arr[i++] = a[m++];
                 
        }
        while (n < b.length) {
            arr[i++] = b[n++];
        }
    }
}