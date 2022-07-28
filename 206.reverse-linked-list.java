/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
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
    public ListNode reverseList(ListNode head) {

        if (head == null)
            return head;

        ListNode prev = null;
        ListNode present = head;
        ListNode next = head.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null)
                next = next.next;
        }
        return prev;

    }
}
// @lc code=end
