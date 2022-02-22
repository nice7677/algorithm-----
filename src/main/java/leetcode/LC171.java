package leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * LeetCode 171. Excel Sheet Column Number
 */
public class LC171 {

    public static void main(String[] args) {
        System.out.println(titleToNumber("AA"));
    }

    public static int titleToNumber(String columnTitle) {
        int result = 0;
        int length = columnTitle.length();
        for (int i = 0; i < length; i++) {
            result = result * 26;
            result += (columnTitle.charAt(i) - 'A' + 1);
        }
        return result;
    }

}
