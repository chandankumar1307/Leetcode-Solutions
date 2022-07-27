/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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
}
// @lc code=end
