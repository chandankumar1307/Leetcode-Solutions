import java.util.HashMap;

/*
 * @lc app=leetcode id=560 lang=java
 *
 * [560] Subarray Sum Equals K
 */

// @lc code=start
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int start = 0, end = -1, currentSum = 0;
        int count = 0;
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        return count;
    }
}
// @lc code=end
