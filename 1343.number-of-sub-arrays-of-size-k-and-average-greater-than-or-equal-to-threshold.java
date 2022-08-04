/*
 * @lc app=leetcode id=1343 lang=java
 *
 * [1343] Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
 */

// @lc code=start
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        if (arr.length < k)
            return 0;
        int l = 0, r = k;
        int sum = 0;
        for (int i = 0; i < r; i++) {
            sum += arr[i];
        }
        double avg = sum / k;
        int count = 0;
        while (true) {
            if (avg >= threshold)
                count++;

            if (r >= arr.length)
                break;
            sum += arr[r];
            sum -= arr[l];
            avg = sum / k;
            r++;
            l++;
        }
        return count;
    }
}
// @lc code=end
