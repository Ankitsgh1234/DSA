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
    public int findSecondMinimumValue(TreeNode root) {
        TreeSet<Integer> arr=new TreeSet<>();
        travel(root,arr);
        // int m1=Integer.MAX_VALUE;
        // int m2=Integer.MAX_VALUE;
        // int n=arr.size();
        // for(int i=0;i<n;i++){
        //     m1=Math.min(m1,arr.get(i));
        // }
        // for(int i=0;i<n;i++){
        //    if(arr.get(i)!=m1&&arr.get(i)<m2){
        //     m2=arr.get(i);
        //    }
        // }
        // if(m2==Integer.MAX_VALUE){
        //     return -1;
        // }
        if(arr.size()<=1){
            return -1;
        }
        arr.pollFirst();
        return arr.first();
    }
    public static void travel(TreeNode root,Set<Integer> arr){
        if(root==null){
            return ;
        }
        arr.add(root.val);
        travel(root.left,arr);
        travel(root.right,arr);
        return;
    }
}