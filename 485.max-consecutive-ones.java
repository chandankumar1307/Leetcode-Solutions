/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int l = 0;
        int r = 0;
        boolean flag = false;
        int max = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        while (true) {

            if (r >= nums.length)
                break;

            if (nums[r] == 1) {
                max = Math.max(max, (r - l));
                flag = true;
                r++;
            } else {
                r++;
                l = r;
            }
        }
        if (!flag)
            return 0;
        else {

            return max + 1;
        }

    }
}
// @lc code=end
