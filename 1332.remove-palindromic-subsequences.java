/*
 * @lc app=leetcode id=1332 lang=java
 *
 * [1332] Remove Palindromic Subsequences
 */

// @lc code=start
class Solution {

    public boolean palindrome(String a) {
        int i = 0;
        int j = a.length() - 1;
        while (i < j) {
            if (a.charAt(i) == a.charAt(j)) {
                i++;
                j--;
                continue;
            }
            return false;
        }
        return true;
    }

    public int removePalindromeSub(String s) {
        int l = s.length();
        if (l <= 0)
            return 0;
        else if (palindrome(s))
            return 1;
        else
            return 2;
    }
}
// @lc code=end
