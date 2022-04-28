/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int position(char a) {
        char roman[] = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
        int answer = -1;
        for (int i = 0; i < 7; i++) {
            if (a == roman[i])
                answer = i;

        }
        return answer;
    }

    public int romanToInt(String s) {
        int value[] = { 1, 5, 10, 50, 100, 500, 1000 };

        int result = 0;
        int c1, c2;

        for (int i = 0; i < s.length(); i++) {
            c1 = position(s.charAt(i));
            if (i != s.length() - 1) {
                c2 = position(s.charAt(i + 1));
                if (c1 < c2) {
                    result = result + (value[c2] - value[c1]);
                    i = i + 1;
                    continue;
                } else {
                    result = result + value[c1];
                }
            } else {
                result = result + value[c1];
            }
        }
        return result;
    }

}
// @lc code=end
