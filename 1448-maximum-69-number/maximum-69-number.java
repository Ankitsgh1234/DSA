class Solution {
    public int maximum69Number (int num) {
        int n=num;
        int rev=0;
        while(n!=0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        int d=rev;
        int c=0;
        boolean f=false;
        while(rev!=0){
            c++;
            if(rev%10==6){
                break;
            }
            rev=rev/10;
        }
        rev=d;
        int p=0;
        int o=0;
        while(rev!=0){
        p++;
           int s=rev%10;
           if(p==c){
            o=o*10+9;
            rev=rev/10;
            continue;
           }
           o=o*10+s;
           rev=rev/10;
        }
        return o;

    }
}