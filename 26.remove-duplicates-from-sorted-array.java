/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int a = Integer.MAX_VALUE;
        int k = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int p = i + 1;
            if (p == nums.length)
                break;
            while (nums[p] == nums[i]) {
                nums[p] = a;
                p++;
                k--;
                if (p == nums.length)
                    break;
            }

        }
        Arrays.sort(nums);
        return k;
    }
}
// @lc code=end
