/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
import java.util.*;

class Solution {
    public int maxSubArray(int[] arr) {
        int sum = 0;
        int n = arr.length;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            max = Math.max(sum, max);
            if (sum < 0)
                sum = 0;
        }
        return max;
    }
}
// @lc code=end
