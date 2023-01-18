/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int r = 0, w = 0, b = 0;
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            if (nums[i] == 0)
                r++;
            else if (nums[i] == 1)
                w++;
            else
                b++;
        }

        int k = 0;
        while (r > 0) {
            nums[k] = 0;
            k++;
            r--;
        }
        while (w > 0) {
            nums[k] = 1;
            k++;
            w--;
        }
        while (b > 0) {
            nums[k] = 2;
            k++;
            b--;
        }
    }
}
// @lc code=end
