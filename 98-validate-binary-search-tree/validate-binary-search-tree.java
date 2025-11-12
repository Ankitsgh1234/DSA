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
    TreeNode prev = null; // keep track of previous node
    boolean isValid = true; // global flag

    public boolean isValidBST(TreeNode root) {
        inorder(root);
        return isValid;
    }

    public void inorder(TreeNode root) {
        if (root == null || !isValid) return;

        inorder(root.left);

        // check increasing order property
        if (prev != null && root.val <= prev.val) {
            isValid = false;
            return;
        }

        prev = root;

        inorder(root.right);
    }
}
