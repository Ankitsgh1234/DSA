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
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }
        int c=p(root,targetSum);
         c+=pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
        return c;
    }

    public static int p(TreeNode root,long sum){
        if(root==null){
            return 0;
        }
        int c=0;
        if(root.val==sum){
            c++;
        }
        return c+p(root.left,sum-root.val)+p(root.right,sum-root.val);
    }
}