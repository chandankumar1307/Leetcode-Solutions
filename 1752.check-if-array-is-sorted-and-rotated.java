/*
 * @lc app=leetcode id=1752 lang=java
 *
 * [1752] Check if Array Is Sorted and Rotated
 */

// @lc code=start
class Solution {
    public boolean check(int[] nums) {
        int X=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                X=i+1;
                break;
            }
        }
        int A[]=rotateArray(nums, X);
        for(int i=0;i<nums.length-1;i++){
            // if(A[i] != nums[(i+X) % A.length])
            if(A[i]>A[i+1])
            return false;
        }
        return true;
    }

    int[] rotateArray(int[] nums, int X){
        int[] temp = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[i]=nums[(i+X)%nums.length];
        }
        return temp;
    }
   
    }

// @lc code=end

