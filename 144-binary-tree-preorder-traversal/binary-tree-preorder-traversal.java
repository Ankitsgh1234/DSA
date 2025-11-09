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
    public static void pre(TreeNode r,List<Integer> list){
        if(r==null){
            return ;
        }
        list.add(r.val);
        pre(r.left,list);
        pre(r.right,list);
        
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        pre(root,arr);
        return arr;
        
    }
}