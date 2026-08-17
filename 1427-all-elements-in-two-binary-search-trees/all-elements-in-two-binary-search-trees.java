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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> lt= new ArrayList<>();
        add(root1,lt);
        add(root2,lt);
        Collections.sort(lt);
        return lt;
    }
    public void add(TreeNode root,List<Integer> lt){
        if(root==null){
            return ;
        }
        lt.add(root.val);
        add(root.left,lt);
        add(root.right,lt);
    }
}