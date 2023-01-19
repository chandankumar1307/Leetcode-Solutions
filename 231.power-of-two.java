/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */

// @lc code=start

class Solution {
    public boolean isPowerOfTwo(int n) {
        double a = Math.log10(n) / Math.log10(2);
        if (a - Math.floor(a) == 0) {
            return true;
        } else
            return false;
    }
}
// @lc code=end
