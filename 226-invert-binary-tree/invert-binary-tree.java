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
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        // TreeNode temp=root.left;
        // root.left=root.right;
        // root.right=temp;
        // invertTree(root.left);
        // invertTree(root.right);
        // return root;
        return rev(root);


        
    }

    public static TreeNode rev(TreeNode root){
         if(root==null){
            return null;
        }
        if(root.left==null&&root.right==null){
            return root;
        }
        if(root.left!=null&&root.right!=null){
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
            rev(root.left);
            rev(root.right);
        }
       else if(root.left!=null&&root.right==null){
            TreeNode temp=root.left;
            root.left=null;
            root.right=temp;
            // rev(root.left);
            rev(root.right);
        }
        else if(root.left==null&&root.right!=null){
            TreeNode temp=root.right;
            root.left=temp;
            root.right=null;
            rev(root.left);
            // rev(root.right);
        }
        else{
            return root;
        }
        return root;

    }
}