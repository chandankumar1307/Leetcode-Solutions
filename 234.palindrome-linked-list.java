/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
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

    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode reverseSecond = headSecond;

        while (head != null && headSecond != null) {
        if (head.val != headSecond.val) {
        break;
        }
        head = head.next;
        headSecond = headSecond.next;
        }

        reverseList(reverseSecond);

        if (head == null || headSecond == null)
        return true;
        else
        return false;

        
}
// @lc code=end
