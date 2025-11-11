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
         int count=sum(root,targetSum);
        count+= pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
        return count;
    }

    public static int sum(TreeNode root,long sum){
        
        if(root==null){
            return 0;

        }
        int count=0;
        if(root.val==sum){
            count++;
        }
       
        return count+ sum(root.left,sum-root.val)+sum(root.right,sum-root.val);
        
    }
}