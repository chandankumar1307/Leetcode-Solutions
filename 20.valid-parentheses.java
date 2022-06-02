/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    char brakcets[] = { '(', ')', '[', ']', '{', '}' };

    public int checkIndex(char a) {
        for (int i = 0; i < 6; i++) {
            if (a == brakcets[i])
                return i;
        }
        return -1;
    }

    public boolean isValid(String s) {

        boolean flag = true;
        char a, a1;
        if (s.length() % 2 != 0)
            flag = false;
        else {
            for (int i = 0; i < s.length(); i = i + 2) {
                a = s.charAt(i);
                a1 = s.charAt(s.length() - i);
                int index = checkIndex(a);
                // int index1 = checkIndex(a1);
                if (index == -1) {
                    flag = false;

                } else {
                    if (brakcets[index + 1] != s.charAt(i + 1)) {
                        flag = false;
                        break;
                    }
                    // else if(brakcets[index+1]!=brakcets[index1]){

                    // }
                }
            }
        }

        return flag;

    }
}
// @lc code=end
