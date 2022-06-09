/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted numsay
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        int a[] = new int[2];
        int mid = (first + last) / 2;
        while (first <= last) {
            if (nums[mid] < target) {
                first = mid + 1;
            } else if (nums[mid] == target) {

                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            a[0] = -1;
            a[1] = -1;
            return a;
        }
        a[0] = mid;
        a[1] = mid;
        if (nums.length == 2) {
            if (nums[0] == target)
                a[0] = 0;
            if (nums[1] == target)
                a[1] = 1;
            return a;
        }

        int l1 = mid - 1;
        int l2 = mid + 1;
        while (l1 >= 0) {

            if (l2 >= nums.length)
                break;
            if (nums[l1] == target) {
                a[0] = l1;
                l1--;
            }
            if (nums[l2] == target) {
                a[1] = l2;
                l2++;
            }
            if (nums[l1] != target && nums[l2] != target)
                break;
        }
        return a;
    }
}
// @lc code=end
