class Solution {
    public int hammingWeight(int n) {

        String sb = Integer.toBinaryString(n);

        int count =0;
        for(int i=0;i<sb.length();i++){
             
            if(sb.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}