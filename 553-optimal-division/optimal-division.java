class Solution {
    public String optimalDivision(int[] nums) {
        int n=nums.length;
        if(n==1){
            String ans="";
            ans+=nums[0];
            return ans;
        }
        if(n==2){
            String ans="";
            ans+=nums[0];
            ans+="/";
            ans+=nums[1];
            return ans;
        }
        String ans="";
        ans+=nums[0];
        ans+="/(";
        int i=1;

        while(i<n){
            ans+=nums[i];
            ans+="/";
            i++;

        }
        String s=ans.substring(0,ans.length()-1);
        s+=")";

        return s;
        
    }
}