/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
import java.util.Arrays;

class Solution {

    public boolean containsDuplicate(int[] nums) {
        int l = nums.length;
        Arrays.sort(nums);

        boolean check = false;

        for (int i = 0; i < l - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                check = true;
                break;
            }
        }
        return check;

    }

    // public static void main(String args[]) {
    // Main obj = new Main();
    // int a[] = { 1, 2, 3, 1 };
    // System.out.println(obj.max(a));

    // boolean check = obj.containsDuplicate(a);
    // System.out.println(check);
    // }
}
// @lc code=end
