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
    public boolean isBalanced(TreeNode root) {
        if(root==null||(root.right==null&&root.left==null)){
            return true;
        }
        int h1=height(root.left);
        if(root.left!=null){
            h1++;
        }
        int h2=height(root.right);
        if(root.right!=null){
            h2++;
        }
        int d=h1-h2;
        if(d<0){
            d=-d;
        }
        if(d>1){
            return false;
        }
       return (isBalanced(root.left)&&isBalanced(root.right));
        

    }
    public int height(TreeNode root){
        if(root==null||(root.left==null&&root.right==null)){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
}