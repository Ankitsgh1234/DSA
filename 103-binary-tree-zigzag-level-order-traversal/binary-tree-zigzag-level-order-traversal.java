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
      public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> arr=new ArrayList<>();
        if (root == null) {
            return arr;
        }
        for (int i = 1; i <= height(root); i++) {
            List<Integer> t=new ArrayList<>();
            if (i % 2 == 1)
                nthorder(root, i,t);
            else
                nthorder1(root, i,t);
            arr.add(t);
        }
        return arr;
    }

    public static void nthorder(TreeNode root, int n,List<Integer> t) {
        if (root == null) {
            return;
        }
        if (n == 1) {

            // System.out.print(root.val + " ");
            t.add(root.val);
            return;
        }

        nthorder(root.left, n - 1,t);
        nthorder(root.right, n - 1,t);

    }

    public static void nthorder1(TreeNode root, int n,List<Integer> t) {
        if (root == null) {
            return;
        }
        if (n == 1) {

            // System.out.print(root.val + " ");
            t.add(root.val);
            return;
        }
        

        nthorder1(root.right, n - 1,t);
        nthorder1(root.left, n - 1,t);
        
    }
}