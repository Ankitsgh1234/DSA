class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);

        }
        int max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            if(e.getValue()>max){
                max=e.getValue();
            }
        }
        int s=0;
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            if(e.getValue()==max){
                s+=e.getValue();
            }
        }
        return s;

        
    }
}