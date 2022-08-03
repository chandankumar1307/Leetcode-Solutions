/*
 * @lc app=leetcode id=1876 lang=java
 *
 * [1876] Substrings of Size Three with Distinct Characters
 */

// @lc code=start
class Solution {
    public int countGoodSubstrings(String s) {
        int a1 = 0, a2 = 1, a3 = 2;
        int count = 0;
        while (a3 < s.length()) {
            if (s.charAt(a1) != s.charAt(a2) && s.charAt(a2) != s.charAt(a3) && s.charAt(a3) != s.charAt(a1))
                count++;
            a1++;
            a2++;
            a3++;
        }
        return count;
    }
}
// @lc code=end
