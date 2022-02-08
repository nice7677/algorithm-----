package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 557. Reverse Words in a String III
 */
public class LC557 {

    public static void main(String[] args) {
        System.out.println(reverseWords("God Ding"));
    }

    /**
     * Runtime: 15 ms, faster than 37.77% of Java online submissions for Reverse Words in a String III.
     * Memory Usage: 52.6 MB, less than 18.20% of Java online submissions for Reverse Words in a String III.
     * @param s
     * @return
     */
    public static String reverseWords(String s) {

        String[] sSplit = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int j;
        List<String> s1List = new ArrayList<>();
        for (String s1 : sSplit) {
            char[] s1CharArray = s1.toCharArray();
            j = 0;
            for (int i = 0; i < s1CharArray.length; i++) {
                if (i >= s1CharArray.length - 1 - i) {
                    s1List.add(new String(s1CharArray));
                    break;
                }
                char a = s1CharArray[i];
                char b = s1CharArray[s1CharArray.length - 1 - i];
                s1CharArray[i] = b;
                s1CharArray[s1CharArray.length - 1 - i] = a;
            }
            j++;
        }
        j = 0;
        for (String s1 : s1List) {
            sb.append(s1);
            if (j != s1List.size() - 1) sb.append(" ");
            j++;
        }
        return sb.toString();
    }

}
