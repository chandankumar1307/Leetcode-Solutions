/*
 * @lc app=leetcode id=1480 lang=java
 *
 * [1480] Running Sum of 1d Array
 */

// @lc code=start
class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int l = nums.length;
        int n[] = new int[l];
        for (int i = 0; i < l; i++) {
            sum = sum + nums[i];
            n[i] = sum;
        }
        return n;

    }
}
// @lc code=end
