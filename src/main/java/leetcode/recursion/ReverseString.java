package leetcode.recursion;

/**
 * 재귀 연습문제
 */
public class ReverseString {

    /**
     * Example 1:
     * <p>
     * Input: s = ["h","e","l","l","o"]
     * Output: ["o","l","l","e","h"]
     * Example 2:
     * <p>
     * Input: s = ["H","a","n","n","a","h"]
     * Output: ["h","a","n","n","a","H"]
     *
     * @param args
     */
    public static void main(String[] args) {
        reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
    }

    public static void reverseString(char[] s) {
        boolean[] change = new boolean[s.length];
        for (int i = 0; i < s.length; i++) {
            if (!change[s.length - 1 - i] && !change[i]) {
                change[s.length - 1 - i] = true;
                change[i] = true;
                char s2 = s[i];
                s[i] = s[s.length - 1 - i];
                s[s.length - 1 - i] = s2;
            }
            System.out.println(s[i]);
        }
    }

}
