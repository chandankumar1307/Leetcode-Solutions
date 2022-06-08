/*
 * @lc app=leetcode id=41 lang=java
 *
 * [41] First Missing Positive
 */

// @lc code=start
import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int a = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                a = nums[i];
                break;
            }
        }

        if (a > 1 || a == 0) {

            return 1;
        }
        while (a == nums[i]) {
            i++;
            if (i == nums.length) {
                a++;
                return a;
            }
            if (a == nums[i])
                continue;
            a++;
        }

        return a;

    }
}
// @lc code=end
