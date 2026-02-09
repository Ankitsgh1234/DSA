class Solution {
    public int splitNum(int num) {
        int n=num;
        int c=0;
        while(n!=0){
            n=n/10;
            c++;
        }
        int[] a1=new int[c];
        n=num;
        c=0;
        while(n!=0){
            a1[c]=n%10;
            n=n/10;
            c++;
        }

        Arrays.sort(a1);
        int n1=0;
        int n2=0;

        for(int i=0;i<c;i+=2){
            n1=n1*10+a1[i];
        }
        for(int i=1;i<c;i+=2){
            n2=n2*10+a1[i];
        }
        return n1+n2;
    }
}