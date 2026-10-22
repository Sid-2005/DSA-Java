/**
 * Problem: 160. Intersection of Two Linked Lists
 * Approach: Two Pointers (Track Switching)
 * Time Complexity: O(M + N) - Each pointer traverses at most the length of both lists.
 * Space Complexity: O(1) - Only two pointers are used.
 */

package LeetCode.linked_list;
class Solution_160 {

    public class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1,head);

        head = dummy;
        ListNode slow = head;
        ListNode fast = head;

        while(n > 0)
        {
            fast = fast.next;
            n--;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}