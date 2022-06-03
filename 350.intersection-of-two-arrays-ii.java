/*
 * @lc app=leetcode id=350 lang=java
 *
 * [350] Intersection of Two Arrays II
 */

// @lc code=start
import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int l[] = new int[2];
        if (nums1.length > nums2.length) {

            l[0] = nums1.length;
            l[1] = 1;

        } else {

            l[0] = nums2.length;
            l[1] = 2;
        }
        int nums3[] = new int[l[0]];
        int k = 0;
        for (int i = 0; i < l[0]; i++) {
            if (l[1] == 1) {

                if (nums1[i] > nums2[k])
                    k++;

                if (k >= nums2.length)
                    break;

                if (nums1[i] == nums2[k]) {
                    nums3[k] = nums1[i];
                    k++;
                }
            } else {

                if (nums2[i] > nums1[k])
                    k++;

                if (k >= nums1.length)
                    break;

                if (nums2[i] == nums1[k]) {
                    nums3[k] = nums2[i];
                    k++;
                }
            }
        }

        int size = 0;
        for (int i = 0; i < l[0]; i++) {
            if (nums3[i] != 0)
                size++;
        }
        int ans[] = new int[size];
        for (int i = 0; i < size; i++)
            ans[i] = nums3[i];
        return ans;

    }
}
// @lc code=end
