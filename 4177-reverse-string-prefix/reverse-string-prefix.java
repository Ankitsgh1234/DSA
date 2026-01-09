class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int diff=n;
        for(int i=k-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        for(int i=k;i<n;i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();

    }
}