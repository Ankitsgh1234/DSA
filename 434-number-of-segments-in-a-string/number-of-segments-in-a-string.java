class Solution {
    public int countSegments(String s) {
        s.strip();
        s=s+" ";
        int n=s.length();
        int c=0;
        if(n==0){
            return 0;
        }
        int k=0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)!=' '&&s.charAt(i+1)==' '){c++;
            k++;}
        }
        if(k!=0)
        return c;
        return 0;
    }
}