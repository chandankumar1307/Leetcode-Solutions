/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maximum = 0;
        int area = 0;
        while (left < right) {
            int a = Math.min(height[left], height[right]);
            area = a * (right - left);
            if (area > maximum)
                maximum = area;

            if (height[left] > height[right])
                right--;
            else if (height[left] < height[right])
                left++;
            else {
                left++;
                right--;
            }
        }
        return maximum;
    }
}
// @lc code=end
