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
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode h=new ListNode(0);
        ListNode q=h;
        int sum=0;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val==0){
                
                q.next=new ListNode(sum);
                q=q.next;
                sum=0;
            }
            sum+=temp.val;
            temp=temp.next;
        }
        return h.next.next;
        
    }
}