class Solution {
    public int mostFrequentEven(int[] nums) {

        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {

                mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
            }
        }
        if(mp.isEmpty()){
            return -1;
        }

        int maxf=0;
        int ans=Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){

            int num=entry.getKey();
            int fre=entry.getValue();
            if(fre>maxf||(fre==maxf&&num<ans)){
                maxf=fre;
                ans=num;
            }
        }
        return ans;

         
    }
}