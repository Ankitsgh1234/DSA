class Solution {
    public int arraySign(int[] nums) {
         int cn=0;
         int z=0;
         for(int i:nums){
            if(i<0){
                cn++;
            }
            else if(i==0){
                z++;
            }
         }


        if(z!=0){
            return 0;
        }
        else if(cn%2==0){
            return 1;
        }
        else return  -1;
        
    }
}