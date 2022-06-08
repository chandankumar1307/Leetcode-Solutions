/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();

        if (nums.length < 3)
            return list;

        for (int i = 0; i < nums.length - 2; i++) {
            int p1 = i + 1;
            int p2 = nums.length - 1;
            while (p1 < p2) {
                if ((nums[i] + nums[p1] + nums[p2]) == 0) {
                    l1.add(nums[i]);
                    l1.add(nums[p1]);
                    l1.add(nums[p2]);
                    list.add(l1);
                    l1.clear();
                    break;
                } else if ((nums[p1] + nums[p2]) > nums[i])
                    p2--;
                else
                    p1++;
            }

        }

        return list;

    }
}
// @lc code=end
