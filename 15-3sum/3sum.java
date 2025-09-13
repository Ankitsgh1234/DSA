class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> arr=new HashSet<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            Set<Integer> st=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int t=-(nums[i]+nums[j]);
                    if(st.contains(t)){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], t);
                        Collections.sort(temp);  
                        arr.add(temp); 
                    
                }
                st.add(nums[j]);
            }
        }
        return new ArrayList<>(arr);
        
    }
}