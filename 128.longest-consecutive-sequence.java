/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int max=1;
        if(nums.length==0)
        return 0;
        if(nums.length==1)
        return 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]==1 ){
            count++;
            max=Math.max(max,count);
            }
            else if(nums[i]-nums[i-1]!=0)
            count=1;
        }
        return max;
    }
}
// @lc code=end

