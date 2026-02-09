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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode l2last = list2;
        while (l2last.next != null) {
            l2last = l2last.next;
        }
        int i = 0;
        ListNode l1 = list1;
        ListNode l2 = list1.next;
        while (i < a-1) {
            l1 = l1.next;
            l2 = l2.next;
            i++;
        }
        i=a;
        l1.next = list2;
        // System.out.println(l2.val);
        while (i <= b&&l2.next!=null) {
            l2 = l2.next;
            i++;
        }
        // System.out.println(l2.val);
        l2last.next = l2;
        return list1;
    }
}