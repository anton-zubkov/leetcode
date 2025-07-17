package leetcode.tasks;

import org.junit.jupiter.api.Test;
import util.ListNode;

import java.util.ArrayList;
import java.util.List;

import static leetcode.tasks._0002_AddTwoNumbers.addTwoNumbers;
import static org.junit.jupiter.api.Assertions.*;

class _0002_AddTwoNumbersTest {

    @Test
    public void testExample1() {
        ListNode l1 = buildList(2, 4, 3);
        ListNode l2 = buildList(5, 6, 4);
        ListNode result = addTwoNumbers(l1, l2);
        assertEquals(List.of(7, 0, 8), toList(result)); // 342 + 465 = 807
    }

    @Test
    public void testExample2() {
        ListNode l1 = buildList(0);
        ListNode l2 = buildList(0);
        ListNode result = addTwoNumbers(l1, l2);
        assertEquals(List.of(0), toList(result));
    }

    @Test
    public void testExample3() {
        ListNode l1 = buildList(9, 9, 9, 9, 9, 9, 9);
        ListNode l2 = buildList(9, 9, 9, 9);
        ListNode result = addTwoNumbers(l1, l2);
        assertEquals(List.of(8, 9, 9, 9, 0, 0, 0, 1), toList(result));
    }

    @Test
    public void testDifferentLength() {
        ListNode l1 = buildList(1, 8); // 81
        ListNode l2 = buildList(0);    // 0
        ListNode result = addTwoNumbers(l1, l2);
        assertEquals(List.of(1, 8), toList(result));
    }

    @Test
    public void testCarryOver() {
        ListNode l1 = buildList(5);
        ListNode l2 = buildList(5);
        ListNode result = addTwoNumbers(l1, l2);
        assertEquals(List.of(0, 1), toList(result)); // 5 + 5 = 10
    }

    private ListNode buildList(int... nums) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    private List<Integer> toList(ListNode head) {
        List<Integer> result = new ArrayList<>();
        while (head != null) {
            result.add(head.val);
            head = head.next;
        }
        return result;
    }
}
