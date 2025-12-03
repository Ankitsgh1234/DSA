class Solution {
    public int scoreOfString(String s) {

        int n=s.length();
        int i=0;
        int sum=0;
        while(i<n-1){
            int l1=s.charAt(i);
            int l2=s.charAt(i+1);
            int diff=l1-l2;
            if(diff<0){
                diff=-(diff);
            }
            sum+=diff;
            i++;
        }
        return sum;
    }
}