/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> arr=new ArrayList<>();

        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        int[] nrr = arr.stream().mapToInt(i -> i).toArray();
        int n=nrr.length;
        return create(nrr,n-1,0);

        
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