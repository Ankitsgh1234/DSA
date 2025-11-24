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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode temp=new TreeNode(val);
        if(root==null){
            return temp;
        }
        if(root.val>val&&root.left==null){
            root.left=temp;
            return root;
        }
        if(root.val<val&&root.right==null){
            root.right=temp;
            return root;
        }
        if(root.val>val&&root.left!=null){
            insertIntoBST(root.left,val);
        }
        if(root.val<val&&root.right!=null){
            insertIntoBST(root.right,val);
        }
        return root;
        
    }
}