/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
import java.util.*;

class Solution {
    public int maxSubArray(int[] nums) {
        int l = nums.length;
        int i = 0, s = 0, m = nums[0];
        int[] b = new int[l];

        while (i != l) {
            b[i] = nums[i];
            i++;
        }

        Arrays.sort(b);
        if (b[l - 1] <= 0)
            return b[l - 1];

        i = 0;
        while (i != l) {
            s += nums[i];
            if (s < 0) {
                s = 0;
            } else if (s > m)
                m = s;
            // System.out.println(m);
            i++;
        }
        // System.out.println(m);
        return m;
    }
}
// @lc code=end
