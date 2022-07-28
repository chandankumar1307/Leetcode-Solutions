/*
 * @lc app=leetcode id=148 lang=java
 *
 * [148] Sort List
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyMerge = new ListNode();
        ListNode merge = dummyMerge;
        // if (list1.val < list2.val) {
        // merge = list1;
        // list1 = list1.next;
        // } else {
        // merge = list2;
        // list2 = list2.next;
        // }
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                merge.next = list1;
                list1 = list1.next;
                merge = merge.next;
            } else {
                merge.next = list2;
                list2 = list2.next;
                merge = merge.next;
            }
        }
        merge.next = list1 != null ? list1 : list2;
        return dummyMerge.next;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode mid = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return mergeTwoLists(left, right);
    }
}
// @lc code=end
