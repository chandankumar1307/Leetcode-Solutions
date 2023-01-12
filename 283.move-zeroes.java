/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int l=nums.length;
        int p1=0,p2=0;
        while(p1<=l && p2<=l){
            if(p1!=0){
                p1++;
                p2++;
            }
        }
        
    }


}
// @lc code=end

