/*
 * @lc app=leetcode id=1658 lang=java
 *
 * [1658] Minimum Operations to Reduce X to Zero
 */

// @lc code=start
class Solution {
    public int minOperations(int[] nums, int x) {
        int length = nums.length;
        int a1 = 0;
        int a2 = length - 1;
        int count = 0;

        while (a1 <= a2) {
            if (x == 0)
                break;
            int big = Math.max(nums[a1], nums[a2]);
            int min = Math.min(nums[a1], nums[a2]);
            if (x - big >= 0) {
                x = x - big;
                count++;
            } else if (x - min >= 0) {
                x = x - min;
                count++;
            } else {
                return -1;
            }
            if (nums[a1] == big)
                a1++;
            else
                a2--;
        }
        if (x == 0)
            return count;
        else
            return -1;
    }
}
// @lc code=end
