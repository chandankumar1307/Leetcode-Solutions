/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start
class Solution {

    public int result(int n) {
        int sum = 0;
        for (int i = n; i != 0; i = i / 10) {
            int r = i % 10;
            sum = sum + (r * r);
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            fast = result(result(fast));
            slow = result(slow);
            // System.out.println(fast + "/t" + slow);
            if (slow == 1 || fast == 1)
                return true;
        } while (fast != slow);
        return false;
    }
}
// @lc code=end
