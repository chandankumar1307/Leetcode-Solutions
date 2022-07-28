/*
 * @lc app=leetcode id=143 lang=java
 *
 * [143] Reorder List
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

    public ListNode middleNode(ListNode head) {
        ListNode test1 = head;
        ListNode ans = head;
        int length = 0;
        // Finding length of the linkedlist
        while (test1 != null) {
            length++;
            test1 = test1.next;
        }

        int middle = length / 2;

        while (middle > 0) {
            ans = ans.next;
            middle--;
        }
        return ans;
    }

    public void reorderList(ListNode head) {

        if (head == null || head.next == null)
            return;

        ListNode mid = middleNode(head);
        ListNode hs = reverseList(mid);

        ListNode hf = head;
        while (hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;
            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        if (hf != null) {
            hf.next = null;
        }

    }
}
// @lc code=end
