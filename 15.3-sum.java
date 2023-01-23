/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> l = new HashSet<>();
        int n = nums.length;
        if (n == 0)
            return new ArrayList<>();
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (sum == 0)
                    l.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                if (sum > 0)
                    k--;
                if (sum < 0)
                    j++;
            }
        }
        return new ArrayList<>(l);
    }
}
// @lc code=end
