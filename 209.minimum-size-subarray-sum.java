/*
 * @lc app=leetcode id=209 lang=java
 *
 * [209] Minimum Size Subarray Sum
 */

// @lc code=start

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // Arrays.sort(nums);
        int left = 0, right = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;

        while (left < nums.length) {
            if (right < nums.length && sum < target) {
                sum += nums[right];
                right++;
            } else if (sum >= target) {
                minLen = Math.min(minLen, right - left);
                sum -= nums[left];
                left++;
            } else {
                break;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;

    }
}
// @lc code=end
