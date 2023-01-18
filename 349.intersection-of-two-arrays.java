import java.util.HashMap;
import java.util.HashSet;

/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet();
        int size = Math.max(nums1.length, nums2.length);
        int arr[] = new int[size];
        for (int i : nums1) {
            set.add(i);
        }
        int k = 0;
        for (int i : nums2) {
            if (set.contains(i)) {
                arr[k] = i;
                k++;
                set.remove(i);
            }
        }
        int result[] = new int[k];
        for (int i = 0; i < k; i++)
            result[i] = arr[i];

        return result;

    }
}
// @lc code=end
