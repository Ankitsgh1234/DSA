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
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length-1;

        return create(nums,n,0);
        
    }
    public static TreeNode create(int[] arr,int hi,int lo){
        if(lo>hi){
            return null;
        }
        int mid=lo+(hi-lo)/2;
        // if(mid==hi&&hi==lo){
            
        // TreeNode root=new TreeNode(arr[mid]);
        // root.left=null;
        // root.right=null;
        // return root;
        // }
        TreeNode root=new TreeNode(arr[mid]);
        root.left=create(arr,mid-1,lo);
        root.right=create(arr,hi,mid+1);
        return root;
    }
}