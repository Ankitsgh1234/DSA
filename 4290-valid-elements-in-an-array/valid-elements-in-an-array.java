class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> lt= new ArrayList<>();

        int n=nums.length;
        lt.add(nums[0]);
        for(int i=1;i<n;i++){
            boolean l=true;
            boolean r=true;
            if(i==n-1){
                lt.add(nums[i]);
                continue;
            }
            for(int j=0;j<i;j++){
                if(nums[i]<=nums[j]){
                    l=false;
                    break;
                }
            }
            for(int j=n-1;j>i;j--){
                if(nums[i]<=nums[j]){
                    r=false;
                    break;
                }
            }
            if(l||r){
                lt.add(nums[i]);
            }
        }
        return lt;
    }
}