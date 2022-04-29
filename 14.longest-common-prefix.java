/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int flag = 1;
        for (int i = 0; i < strs[0].length(); i++) {
            char t = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() < i + 1) {
                    flag = 0;
                    break;
                }
                if (t != strs[j].charAt(i)) {
                    flag = 0;
                }
            }
            if (flag == 1) {
                result = result + strs[0].charAt(i);
            } else {
                break;
            }
        }
        return result;

    }
}
// @lc code=end
