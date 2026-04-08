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
    public boolean isCousins(TreeNode root, int x, int y) {
        int left=height(root,x,0);
        int right=height(root,y,0);
        
        if(left!=right){
            return false;
        }
        if(left<2){
            return false;
        }
        int p1=getc(root,x);
        int p2=getc(root,y);
        System.out.println(p1);
        System.out.println(p2);
        if(p1==p2){
            return false;
        }
        return true;
    }
    public static int height(TreeNode root,int x,int h){
        if(root==null){
         return 0;

        }
        if(root.val==x){
            return h;
        }
        
        return Math.max(height(root.left,x,h+1),height(root.right,x,h+1));
    }
    public static int getc(TreeNode root, int x) {
        if (root == null) return -1;

        if (root.left != null && root.left.val == x) return root.val;
        if (root.right != null && root.right.val == x) return root.val;

        int left = getc(root.left, x);
        if (left != -1) return left;

        return getc(root.right, x);
    }
}