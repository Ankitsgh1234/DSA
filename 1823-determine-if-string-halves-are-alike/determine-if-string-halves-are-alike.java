class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        String nw=s.substring(0,n/2);
        int c1=vow(s.substring(n/2,n));
        int c2=vow(nw);
        return (c1==c2);
    }
    public static int vow(String s){
        int n=s.length();
        int i=0;
        int c=0;
        while(i<n){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                c++;
            }
            i++;
        }
        return c;
    }
}