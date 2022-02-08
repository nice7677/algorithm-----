package leetcode;

/**
 * LeetCode 344. Reverse String
 */
public class LC344 {

    public static void main(String[] args) {
        reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
    }

    /**
     * Runtime: 2 ms, faster than 38.28% of Java online submissions for Reverse String.
     * Memory Usage: 54.6 MB, less than 11.42% of Java online submissions for Reverse String.
     * @param s
     */
    public static void reverseString(char[] s) {

        for (int i = 0; i < s.length; i++) {
            if (i >= s.length - 1 - i) {
                return;
            }
            char a = s[i];
            char b = s[s.length - 1 - i];
            s[i] = b;
            s[s.length - 1 - i] = a;
        }

    }

}
