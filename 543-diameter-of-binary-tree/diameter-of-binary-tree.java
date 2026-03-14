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
    public int diameterOfBinaryTree(TreeNode root) {
          if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 0;
        }
        int left=diameterOfBinaryTree(root.left);
        int right=diameterOfBinaryTree(root.right);
        int dial=height(root.left);
        int diar=height(root.right);
        int dia=diar+dial;
        if(root.left!=null) dia++;
        if(root.right!=null) dia++;
        return Math.max(left,Math.max(dia,right));
    }
    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
}