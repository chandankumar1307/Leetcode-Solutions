/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        int a = 0, b = nums.length - 1;
        int t = b;
        int N[] = new int[nums.length];
        while (a <= b) {
            if (nums[a] * nums[a] < nums[b] * nums[b]) {
                N[t--] = nums[b] * nums[b];
                b--;
            } else {
                N[t--] = nums[a] * nums[a];
                a++;
            }
        }
        return N;
    }
}
// @lc code=end
