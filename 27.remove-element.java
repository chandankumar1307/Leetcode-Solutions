import java.util.Arrays;

/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        int a = Integer.MAX_VALUE;
        int k = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                k--;
                nums[i] = a;
            }
            // if (nums[i] > val)
            // break;
        }
        Arrays.sort(nums);
        return k;
    }
}
// @lc code=end
