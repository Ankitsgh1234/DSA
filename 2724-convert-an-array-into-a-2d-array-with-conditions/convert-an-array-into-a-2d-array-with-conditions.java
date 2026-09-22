class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int n=nums.length;
        int[] arr=  new int[n+1];
        List<List<Integer>> lt=new ArrayList<>();
        for(int num:nums){
            int freq=arr[num];
            if(freq==lt.size()){
                lt.add(new ArrayList<>());
            }
            lt.get(freq).add(num);
            arr[num]++;
        }
        return lt;
    }
}