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
    Map<TreeNode,Integer> map;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        map=new HashMap<>();
        int a=diameterOfBinaryTree(root.left);
        int b=diameterOfBinaryTree(root.right);
        if(map.containsKey(root)){
            return map.get(root);
        }

        int mid=level(root.left)+level(root.right);
        map.put(root,mid+1);
        if(root.left!=null)mid++;
        if(root.right!=null)mid++;
        map.put(root,Math.max(mid,Math.max(a,b)));
        return map.get(root);
    }
    public static int level(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 0;
        }
        return 1+Math.max(level(root.left),level(root.right));
    }
}