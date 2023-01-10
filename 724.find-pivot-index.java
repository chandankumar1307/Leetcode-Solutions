/*
 * @lc app=leetcode id=724 lang=java
 *
 * [724] Find Pivot Index
 */

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {
        int l=nums.length;
        for(int i=0;i<l;i++){
              int a=sum(nums, 0 , i);
              int b=sum(nums, i+1, l);
            //   System.out.println(a,"\t",b);
            if(a==b)
            return i;
        } 
        return -1;
        
    }

    public int sum(int[] nums, int a, int b){
        int s=0;

        for(int i=a;i<b;i++)
        s=s+nums[i];

        return s;
    }
}
// @lc code=end

