/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {

    public boolean searchMatrix(int[][] mat, int X) {
        int N = mat.length;
        int M = mat[0].length;
        int i = 0, j = M - 1;
        while (i < N && j > -1) {
            if (mat[i][j] == X)
                return true;
            if (mat[i][j] < X)
                i++;
            else
                j--;
        }
        return false;
    }

    // public boolean searchMatrix(int[][] matrix, int target) {

    // }
}
// @lc code=end

