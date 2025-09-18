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
    public ListNode swapNodes(ListNode head, int k) {
        int n = 0;
        ListNode curr = head;

        // 1. find length of list
        while (curr != null) {
            n++;
            curr = curr.next;
        }

        // 2. move to kth node from beginning
        ListNode first = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        // 3. move to kth node from end (n - k + 1)
        ListNode second = head;
        for (int i = 1; i < n - k + 1; i++) {
            second = second.next;
        }

        // 4. swap values (O(1) space, no rewiring needed)
        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }
}
