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
        // System.out.println(height(root));
       if(root==null){
        return 0;
       }
        
        int x=diameterOfBinaryTree(root.left);
        int y=diameterOfBinaryTree(root.right);
        int mid=height(root.left)+height(root.right);
        if(root.left!=null) mid++;
        if(root.right!=null) mid++;


        return Math.max(x,Math.max(y,mid));
        
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