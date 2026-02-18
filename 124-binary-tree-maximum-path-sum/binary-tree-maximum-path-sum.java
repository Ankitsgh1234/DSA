class Solution {
    static int maxsum;
    public static int lineSum(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=lineSum(root.left);
        int right=lineSum(root.right);
        int pathsum=root.val;
        // if(root.val>0){
        // pathsum=root.val;
        // }
        if(left>0)pathsum+=left;
        if(right>0)pathsum+=right;
        maxsum=Math.max(pathsum,maxsum);
        return root.val+Math.max(0,Math.max(left,right));
    }
    public int maxPathSum(TreeNode root) {
        maxsum=root.val;
        int a=lineSum(root);
        return maxsum;
        
    }
}