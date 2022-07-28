/*
 * @lc app=leetcode id=876 lang=java
 *
 * [876] Middle of the Linked List
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
}
// @lc code=end
