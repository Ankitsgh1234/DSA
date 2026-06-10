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
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> lt=new ArrayList<>();
        path(root,lt,"");
        return lt; 

    }
    public static void path(TreeNode root, List<String> lt,String s){
        if(root==null){
            return ;
        }
        if(root.left==null&&root.right==null){
            s+=(root.val);
            lt.add(s);
            return ;
        }
        s+=(root.val);
        s+=("->");
        path(root.left,lt,s);
        path(root.right,lt,s);
        return ;

    }
}