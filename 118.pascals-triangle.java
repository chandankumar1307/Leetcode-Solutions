/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0)
            return new ArrayList();
        List<List<Integer>> l1 = new ArrayList();
        int sum = 1;
        for (int i = 0; i < numRows; i++) {
            List<Integer> l2 = new ArrayList();
            l2.add(1);
            for (int j = 0; j < i - 1; j++) {
                sum = l1.get(i - 1).get(j) + l1.get(i - 1).get(j + 1);
                l2.add(sum);
            }
            if (i != 0)
                l2.add(1);
            l1.add(l2);
        }
        return l1;
    }
}
// @lc code=end
