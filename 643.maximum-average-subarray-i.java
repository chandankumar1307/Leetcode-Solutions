/*
 * @lc app=leetcode id=643 lang=java
 *
 * [643] Maximum Average Subarray I
 */

// @lc code=start
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // int l = 0;
        // int r = 0;
        // long sum = 0;
        // // double avg = 0.0;
        // double max = Integer.MIN_VALUE;
        // int length = nums.length;
        // while (l <= r && r < length) {
        // if (r < k) {
        // sum = sum + nums[r];
        // // avg = sum / k;
        // r++;
        // max = Math.max(max, sum);
        // } else {

        // if (r >= length)
        // break;
        // sum = (sum + nums[r]);
        // sum -= nums[l];
        // // avg = sum / k;
        // r++;
        // l++;
        // max = Math.max(max, sum);
        // }
        // }
        // return max / 1.0 / k;

        long sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        long max = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }
        return max / 1.0 / k;
    }
}
// @lc code=end
