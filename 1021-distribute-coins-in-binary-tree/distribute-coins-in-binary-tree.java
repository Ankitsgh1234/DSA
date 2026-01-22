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
    public int cnt=0;
    public int distributeCoins(TreeNode root) {
        op(root);
        return cnt;
    }

    public int op(TreeNode root){
        if(root==null) return 0;

        int left=op(root.left);
        int right=op(root.right);

        cnt+=Math.abs(left) + Math.abs(right);
        return left+right+(root.val)-1;         
    }
}