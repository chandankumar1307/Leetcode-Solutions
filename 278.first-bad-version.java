/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int target = 0;
        int l = 1, r = n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (!isBadVersion(mid)) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}
// @lc code=end
