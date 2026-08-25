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
    int max=Integer.MIN_VALUE;
    public int maxAncestorDiff(TreeNode root) {
        if(root==null){
            return max;
        }
        fmax(root,root.val);
        maxAncestorDiff(root.left);
        maxAncestorDiff(root.right);
        return max;

    }
    public void fmax(TreeNode root,int d){
        if(root==null){
            return;
        }
        if(root.left!=null){
        max=Math.max(max,Math.abs(d-root.left.val));
        }
        if(root.right!=null){
        max=Math.max(max,Math.abs(d-root.right.val));

        }
        fmax(root.right,d);
        fmax(root.left,d);
    }
}