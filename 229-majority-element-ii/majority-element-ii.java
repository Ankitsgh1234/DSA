class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> mp=new HashMap<>();
        List<Integer> lt= new ArrayList<>();
        int n=nums.length;
        
        for(int i=0;i<nums.length;i++){
                 
                mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
                if(mp.get(nums[i])>n/3&&!lt.contains(nums[i])){
                    lt.add(nums[i]);
                }

            
            
        }
        
            return lt;
        
    }
}