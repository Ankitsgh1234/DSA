class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n =s.length();
        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int k=map.get(s.charAt(0));
        for(Integer val:map.values()){
            if(val!=k){
                return false;
            }

        }
        return true;
    }
}