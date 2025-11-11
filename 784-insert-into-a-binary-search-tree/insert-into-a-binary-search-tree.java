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
        if(val<root.val&&root.left==null){
            root.left=temp;

        }
        if(val>root.val&&root.right==null){
            root.right=temp;

        }
        if(val<root.val&&root.left!=null){
            root.left= insertIntoBST(root.left,val);

        }
        if(val>root.val&&root.right!=null){
            root.right= insertIntoBST(root.right,val);

        }
        return root;

        
    }
   
}