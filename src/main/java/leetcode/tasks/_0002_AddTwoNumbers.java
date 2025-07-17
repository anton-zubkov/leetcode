package leetcode.tasks;

import util.ListNode;

public class _0002_AddTwoNumbers {


    /**
     * Adds two non-negative integers represented by two non-empty linked lists.
     * The digits are stored in reverse order, and each node contains a single digit.
     * Returns the sum as a new linked list in the same reversed order.
     * <p>Time Complexity: O(max(N, M)), where N and M are the lengths of the input lists.
     * <p>Space Complexity: O(max(N, M)), due to the new linked list created for the result.
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummyHead.next;
    }
}
