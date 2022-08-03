/*
 * @lc app=leetcode id=350 lang=java
 *
 * [2269] Intersection of Two Arrays II
 */

// @lc code=start

class Solution {
    public int divisorSubstrings(int num, int k) {
        String n = String.valueOf(num);
        int l = 0;
        int r = k;
        int counter = 0;
        while (r <= n.length()) {
            String a = n.substring(l, r);
            int b = Integer.parseInt(a);
            System.out.println(b);
            if (b == 0) {
                l++;
                r++;
                continue;
            }

            if (num % b == 0)
                counter++;
            l++;
            r++;
        }
        return counter;
    }
}

// @lc code=end
