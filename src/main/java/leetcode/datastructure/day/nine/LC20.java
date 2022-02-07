package leetcode.datastructure.day.nine;

import java.util.Stack;

/**
 * LeetCode 20. Valid Parentheses
 */
public class LC20 {

    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }

    /**
     * This problem topic is string and `stack`
     * Runtime: 4 ms, faster than 31.82% of Java online submissions for Valid Parentheses.
     * Memory Usage: 42.6 MB, less than 6.03% of Java online submissions for Valid Parentheses.
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            String peek = "";
            if (!stack.isEmpty()) {
                peek = stack.peek();
            }
            if (peek.equals("(")) {
                if (c == ')') stack.pop();
                else stack.push(String.valueOf(c));
            } else if (peek.equals("{")) {
                if (c == '}') stack.pop();
                else stack.push(String.valueOf(c));
            } else if (peek.equals("[")) {
                if (c == ']') stack.pop();
                else stack.push(String.valueOf(c));
            } else {
                stack.push(String.valueOf(c));
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }

}
