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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int n = height(root);
        List<List<Integer>> ans=new ArrayList<>();
        for (int i = 1; i <= height(root); i++) {
            List<Integer> arr=new ArrayList<>();
            if (i % 2 == 1)
                nthorder(root, i,arr);
            else
                nthorder1(root, i,arr);
                ans.add(arr);
        }
        return ans;
    }

    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // if((root.left==null&&root.right==null)){
        // return 0;
        // }

        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void nthorder(TreeNode root, int n,List<Integer> arr) {
        if (root == null) {
            return;
        }
        if (n == 1) {
            arr.add(root.val);
            
            return;
        }
        

            nthorder(root.left, n - 1,arr);
            nthorder(root.right, n - 1,arr);
        
       
    }

    public static void nthorder1(TreeNode root, int n,List<Integer> arr) {
        if (root == null) {
            return;
        }
        if (n == 1) {

            arr.add(root.val);
            return;
        }
        

        nthorder1(root.right, n - 1,arr);
        nthorder1(root.left, n - 1,arr);
        
       
    }
}