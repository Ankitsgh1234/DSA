/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> t=new ArrayList<>();
        path(root,targetSum,arr,t);
        return arr;
    }
    public void path(TreeNode root,int sum,List<List<Integer>> arr, List<Integer> t){
        if(root==null){
            return;
        }

        if(root.left==null&&root.right==null){
            t.add(root.val);
            if(root.val==sum){
                // t.add(root.val);
                List<Integer> a=new ArrayList<>();
                for(int i=0;i<t.size();i++){
                    a.add(t.get(i));
                }
                arr.add(a);
                // return ;
            }
                t.remove(t.size()-1);
        }
        t.add(root.val);
        path(root.left,sum-root.val,arr,t);
       
        path(root.right,sum-root.val,arr,t);
        t.remove(t.size()-1);
        return ;
    }
}