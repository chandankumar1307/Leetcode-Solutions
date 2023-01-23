/*
 * @lc app=leetcode id=229 lang=java
 *
 * [229] Majority Element II
 */

// @lc code=start
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l=new ArrayList<Integer>();
        Arrays.sort(nums);
        int count=1;
        int n=nums.length;
        if(n<3){
            for(int i=0;i<n;i++){
                if(!l.contains(nums[i]))
                    l.add(nums[i]);
            }
            return l;
        }
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
            count++;
            if(count>n/3 && l.contains(nums[i])==false)
                l.add(nums[i]);
            }
            else{
                
                count=1;
            }
        }
        return l;
    }
}
// @lc code=end

