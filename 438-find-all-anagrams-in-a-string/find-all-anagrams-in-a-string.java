class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // int i=0;
        int n=s.length();
        int m=p.length();
        List<Integer> lt=new ArrayList<>();
        for(int i=0;i<=n-m;i++){
            if(isAnagram(s.substring(i,i+m),p)){
                lt.add(i);
            }
        }
        return lt;
    }
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