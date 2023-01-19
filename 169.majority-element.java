/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] a) {
        int size = a.length;
        if (size == 1)
            return a[0];

        Arrays.sort(a);

        int count = 1;
        int flag[] = { 1, -1 };
        for (int i = 0; i < size - 1; i++) {
            if (a[i] == a[i + 1]) {
                count++;
                if (count > flag[0]) {
                    flag[0] = count;
                    flag[1] = a[i];
                }
            } else
                count = 1;
        }
        return (flag[0] > size / 2) ? flag[1] : -1;
    }
}
// @lc code=end
