class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int c=0;
        int s=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(boxes.charAt(i)=='1'){
                c++;
                s+=i;
            }
        }

        int sum=s;
        arr[0]=sum;
        int l1=0;

        int r1=c;
        for(int i=1;i<n;i++){
            if(boxes.charAt(i-1)=='1'){
                l1++;
                r1--;
            
            }
               sum=sum-r1+l1;
                arr[i]=sum;
        }
        return arr;
    }
}