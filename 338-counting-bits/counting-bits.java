class Solution {
    public int[] countBits(int n) {
        int[] arr=new int [n+1];
        for(int i=0;i<n+1;i++){
            int count=0;

            String sb=Integer.toBinaryString(i);
            for(int j=0;j<sb.length();j++){
                if(sb.charAt(j)=='1'){
                    count++;
                }
                
            }
            arr[i]=count;


        }
        return arr;
        
    }
}