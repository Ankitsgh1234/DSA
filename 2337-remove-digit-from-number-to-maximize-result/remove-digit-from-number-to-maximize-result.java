class Solution {
    public String removeDigit(String number, char digit) {
        String ans = "";
        int n=number.length();
        for(int i=0;i<n;i++){
            if(number.charAt(i)==digit){
                String s=number.substring(0,i)+number.substring(i+1,n);
            
            if(s.compareTo(ans)>0){
                ans=s;
            }}
        }
        return ans;
    }
}