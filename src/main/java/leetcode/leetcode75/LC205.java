package leetcode.leetcode75;

import java.util.Map;

/**
 * 205. Isomorphic Strings
 */
public class LC205 {

    /**
     * Given two strings s and t, determine if they are isomorphic.
     * <p>
     * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
     * <p>
     * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "egg", t = "add"
     * Output: true
     * Example 2:
     * <p>
     * Input: s = "foo", t = "bar"
     * Output: false
     * Example 3:
     * <p>
     * Input: s = "paper", t = "title"
     * Output: true
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= s.length <= 5 * 104
     * t.length == s.length
     * s and t consist of any valid ascii character.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(isIsomorphic("abcdefghijklmnopqrstuvwxyzva", "abcdefghijklmnopqrstuvwxyzck"));
    }

    /**
     * Runtime
     * 130 ms
     * Beats
     * 5.3%
     * Memory
     * 55.8 MB
     * Beats
     * 5.21%
     * 개똥 고쳐야함
     * @param s
     * @param t
     * @return
     */
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        return getPattern(s).equals(getPattern(t));
    }

    static Map<String, Integer> map;
    static StringBuilder sb = new StringBuilder();
    static int i;

    public static String getPattern(String s) {
        map = Map.of();
        sb.setLength(0);
        i = 0;
        for (String sp : s.split("")) {
            if (map.getOrDefault(sp, -1) == -1) {
                map.put(sp, i);
                i++;
            }
            sb.append(map.get(sp)).append(".");
        }
        return sb.toString();
    }


}
