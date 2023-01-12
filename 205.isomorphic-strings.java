/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int alphabet[]=new int[26];
        int l=s.length();
        s=s.toLowerCase();
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            int ct=(int)ch;
            int temp=26 - (ct);
            alphabet[temp]++;
        }
        return true;
    }
}
// @lc code=end

