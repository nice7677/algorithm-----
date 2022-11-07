package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 14. Longest Common Prefix
 */
public class LC14 {

    /**
     * Example 1:
     * <p>
     * Input: strs = ["flower","flow","flight"]
     * Output: "fl"
     * Example 2:
     * <p>
     * Input: strs = ["dog","racecar","car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println("------------------------");
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println("------------------------");
        System.out.println(longestCommonPrefix(new String[]{"a"}));
        System.out.println("------------------------");
        System.out.println(longestCommonPrefix(new String[]{"cir","car"}));
        System.out.println("------------------------");
        System.out.println(longestCommonPrefix(new String[]{"a","a","b"}));
    }

    /**
     * Runtime
     * 14 ms
     * Beats
     * 19.44%
     * Memory
     * 42.3 MB
     * Beats
     * 41.88%
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        String result = "";
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (char c : strs[0].toCharArray()) {
            map.put(sb.append(c).toString(), 1);
        }
        for (String key : map.keySet()) {
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].startsWith(key)) {
                    map.put(key, map.get(key) + 1);
                }
            }
        }
        int min = strs.length;
        for (String key : map.keySet()) {
            if (map.get(key) >= min && key.length() > result.length()) {
                min = map.get(key);
                result = key;
            }
        }
        return result;
    }


}
