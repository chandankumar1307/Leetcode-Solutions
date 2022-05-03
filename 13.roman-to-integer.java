/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

//

// @lc code=start
class Solution {
    public int position(char a) { // a=L
        char roman[] = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
        int answer = -1;
        for (int i = 0; i < 7; i++) {
            if (a == roman[i]) // i=3
                answer = i;

        }
        return answer;
    }

    // s = MCMXCIV
    public int romanToInt(String s) {
        int value[] = { 1, 5, 10, 50, 100, 500, 1000 };

        int result = 0; // 1000+ (1000-100) + (100-10) + (5-1) =
        int c1, c2;
        int l = s.length(); // 7

        for (int i = 0; i < l; i++) {
            c1 = position(s.charAt(i)); // 0
            if (i != l - 1) {
                c2 = position(s.charAt(i + 1)); // 1
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
