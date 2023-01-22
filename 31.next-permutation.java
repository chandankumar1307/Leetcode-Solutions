/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1)
            return;
        int k = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                k = i;
                break;
            }
        }
        if (k == -1) {
            reverse(nums, 0);
            return;
        }
        int p = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > nums[k]) {
                p = i;
                break;
            }
        }
        swap(nums, k, p);

        reverse(nums, k + 1);

    }

    void swap(int a[], int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    void reverse(int a[], int n) {
        int j = a.length - 1;
        while (n < j) {
            swap(a, n++, j--);
        }

    }
}
// @lc code=end
