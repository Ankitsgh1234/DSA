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
    public ListNode doubleIt(ListNode head) {
        if(head==null){
            return null;
        }
        Stack<Integer> st=new Stack<>();
        Stack<Integer> ans=new Stack<>();
        int c=0;
        while(head!=null){
            st.push(head.val);
            head=head.next;            
        }
        while(st.size()!=0){
            int sum=st.pop()*2;
            sum+=c;
            c=sum/10;
            ans.push(sum%10);
        }
        if(c!=0){
            ans.push(c);
        }
        ListNode s=new ListNode(10);
        ListNode dummy=s;
        while(ans.size()!=0){
            ListNode temp=new ListNode(ans.pop());
            dummy.next=temp;
            dummy=temp;
        }
        return s.next;
    }
}