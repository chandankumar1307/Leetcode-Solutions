/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int ans[] = new int[2];
        if (numbers.length == 2) {
            ans[0] = 1;
            ans[1] = 2;
            return ans;
        }

        // int j=(0+numbers.length/2);
        int j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                ans[0] = i + 1;
                ans[1] = j + 1;
                break;
            } else if (target > sum) {
                i++;
            } else if (target < sum) {
                j--;
            }
        }
        return ans;
    }
}
// @lc code=end
