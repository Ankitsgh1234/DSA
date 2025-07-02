class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int s=0;
        for(int i:hours){
            if(i>=target){
                s++;
            }
        }
        return s;
        
    }
}