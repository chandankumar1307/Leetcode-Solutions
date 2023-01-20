/*
 * @lc app=leetcode id=2149 lang=java
 *
 * [2149] Rearrange Array Elements by Sign
 */

// @lc code=start
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l=nums.length;
        int positive[]=new int[l/2];
        int negative[]=new int[l/2];
        int p=0,n=0;
        for(int i=0;i<l;i++){
            if(nums[i]>0){
            positive[p]=nums[i];
            p++;
            }else{
                negative[n]=nums[i];
                n++;
            }
        }
        //now combining the two arrays
        p=0;
        n=0;
        for(int i=0;i<l;i++){
            if(i%2==0)
            {
                nums[i]=positive[p];
                p++;
            }
            else{
                nums[i]=negative[n];
                n++;
            }
        }
        return nums;
    }
}
// @lc code=end

