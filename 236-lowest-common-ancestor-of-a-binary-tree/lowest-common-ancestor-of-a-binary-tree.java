/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==p||root==q){
            return root;
        }
        boolean l=isContains(root.left,p);
        boolean r=isContains(root.right,q);
        if(l&&r){
            return root;
        }
        if(!l&&r){
           return lowestCommonAncestor(root.right,p,q);
        }
        if(l&&!r){
           return lowestCommonAncestor(root.left,p,q);
        }
        return root;
        
    }

    public static boolean isContains(TreeNode root,TreeNode p){
        if(root==null){
            return false;
        }
        if(root==p){
            return true;
        }
        return isContains(root.left,p)||isContains(root.right,p);
        

    }
}