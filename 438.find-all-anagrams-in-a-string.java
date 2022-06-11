/*
 * @lc app=leetcode id=438 lang=java
 *
 * [438] Find All Anagrams in a String
 */

// @lc code=start
import java.util.*;;

class Solution {

    public boolean Anagram(String a, String b) {
        int h1[] = new int[26];
        int h2[] = new int[26];
        // h1[a.charAt(0)]=1;
        for (int i = 0; i < a.length(); i++) {
            int t = a.charAt(i) - 97;
            h1[t]++;
        }

        for (int i = 0; i < a.length(); i++) {
            int t = b.charAt(i) - 97;
            h2[t]++;
        }
        if (Arrays.equals(h1, h2))
            return true;
        else
            return false;
    }

    public List<Integer> findAnagrams(String s, String p) {
        int i = 0;
        List<Integer> list = new ArrayList<Integer>();
        int l = p.length();
        for (; i <= s.length() - l; i++) {
            String c = s.substring(i, i + l);
            if (Anagram(c, p))
                list.add(i);
        }
        return list;
    }
}
// @lc code=end
