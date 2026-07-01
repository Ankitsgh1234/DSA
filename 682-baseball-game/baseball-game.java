class Solution {
    public int calPoints(String[] op) {
        int n=op.length;
        int[] arr=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(isInteger(op[i])){
                arr[k]=Integer.parseInt(op[i]);
                k++;
            }
            else if(op[i].equals("C")){
                k--;
                arr[k]=0;
            }
            else if(op[i].equals("D")){
               
                arr[k]=2*arr[k-1];
                k++;
            }
            else if(op[i].equals("+")){
                arr[k]=arr[k-1]+arr[k-2];
                k++;
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static boolean isInteger(String str) {
    if (str == null || str.isEmpty()) {
        return false;
    }
    try {
        Integer.parseInt(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
}