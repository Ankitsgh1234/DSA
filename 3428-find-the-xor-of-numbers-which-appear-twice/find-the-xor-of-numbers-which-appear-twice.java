class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        
        Map<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        List<Integer> arr=new ArrayList<>();
 
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int num=0;
        int j=0;
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            if(e.getValue()==2){
                arr.add(e.getKey());
                 
            }
        }
        if(arr.size()>0){
        int nm=0;
            for(int i:arr){
                nm=nm^i;
            }


        return nm;
        }
        else return 0;
        
    }
}
         