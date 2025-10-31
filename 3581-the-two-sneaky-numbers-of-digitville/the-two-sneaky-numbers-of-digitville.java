class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[nums[i]]++;
        }
        ArrayList<Integer> n1=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==2){
                n1.add(i);
            }
        }
        int[] res = new int[n1.size()];
        for (int i = 0; i < n1.size(); i++) {
            res[i] = n1.get(i);
        }

        return res;
    }
}