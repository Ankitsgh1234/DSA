class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        // List<Integer> arr=new ArrayList<>();
        int[] arr=new int[2];

        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int num=0;
        int j=0;
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            if(e.getValue()==1){
                arr[j++]=e.getKey();
                if(j==2)
                break;
            }
        }
        System.out.println(arr);
        return arr;
        
    }
}