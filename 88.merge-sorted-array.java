/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int t = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[t];
            t++;
        }
        // System.out.println(Arrays.toString(nums1));
        Arrays.sort(nums1);

    }
}
// @lc code=end
