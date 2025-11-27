class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean[] isvisited=new boolean[nums.length];
        helper(nums,ds,isvisited,ans);
        return ans;
    }
    public static void helper(int[]nums, List<Integer> ds,boolean[] isvalid,List<List<Integer>> ans){
        if(ds.size()==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<ds.size();i++){
                temp.add(ds.get(i));
            }
            ans.add(temp);
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(isvalid[i]==false){
                ds.add(nums[i]);
                isvalid[i]=true;
                helper(nums,ds,isvalid,ans);
                isvalid[i]=false;
                ds.remove(ds.size()-1);
            }
        }

    }
}