class Solution {
    public String finalString(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='i'){
                sb.reverse();
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}