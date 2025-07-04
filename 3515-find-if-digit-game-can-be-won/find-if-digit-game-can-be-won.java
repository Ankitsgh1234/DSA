class Solution {
    public boolean canAliceWin(int[] nums) {

        int a =0;
        int b=0;
        
        for(int i:nums){
            if(i>=10){
                a+=i;
            }
            else{
                b+=i;
            }
        }
         
        // if(a==b){
        //     return false;
        // }
        // else 
        // return true;
        return a!=b;
    }
}