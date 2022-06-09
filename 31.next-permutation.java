/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */

// @lc code=start
import java.util.*;

class Solution {

    int isSorted(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return 1;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1])
                return 2;
        }
        return -1;
    }

    public void nextPermutation(int[] nums) {

        if (nums.length > 3) {

            int t = nums[0];
            int t2 = nums[1];
            int t3 = nums[2];
            int check = isSorted(nums);
            System.out.println(check);

            if (check == 2)
                Arrays.sort(nums);
            else if (check == -1) {

                nums[0] = t2;
                nums[1] = t3;
                nums[2] = t;
            } else {
                nums[1] = t3;
                nums[2] = t2;
            }
        }

    }
}
// @lc code=end
