class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] arr=new int[256];
        for(char ch:s.toCharArray()){
            arr[ch]++;
        }
        for(char ch:t.toCharArray()){
            arr[ch]--;
        }
        for(int i=0;i<256;i++){
            if(arr[i]!=0){
                return false;
            }
        }
                return true;

    }
}