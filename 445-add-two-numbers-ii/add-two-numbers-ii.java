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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        Stack<Integer> ans=new Stack<>();

        while(l1!=null){
            st1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            st2.push(l2.val);
            l2=l2.next;
        }
        ListNode head=new ListNode(10);
        ListNode dummy=head;
        int c=0;
        while(st1.size()!=0||st2.size()!=0||c!=0){
            int sum=0;
            if(st1.size()>0){
                sum+=st1.pop();
            }
            if(st2.size()>0){
                sum+=st2.pop();
            }
            sum+=c;
            ans.push(sum%10);
            c=sum/10;
        }
        while(ans.size()!=0){

            ListNode temp=new ListNode(ans.pop());
            
            dummy.next=temp;
            dummy=temp;
        }
        return head.next;

    }
}