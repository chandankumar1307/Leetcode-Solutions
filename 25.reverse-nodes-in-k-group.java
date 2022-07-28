/*
 * @lc app=leetcode id=25 lang=java
 *
 * [25] Reverse Nodes in k-Group
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null)
                next = next.next;
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
        return head;
    }

    public boolean check(ListNode head, int k) {
        ListNode temp = head;
        for (int i = 1; i <= k; i++) {
            if (temp == null)
                return false;
            temp = temp.next;
        }
        return true;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k < 1 || head == null)
            return head;

        ListNode current = head;
        ListNode prev = null;

        while (true) {

            ListNode last = prev;
            ListNode newEnd = current;
            ListNode next = current.next;

            if (!check(current, k))
                break;

            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null)
                    next = next.next;
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            if (current == null)
                break;
            prev = newEnd;

        }

        return head;

    }
}
// @lc code=end
