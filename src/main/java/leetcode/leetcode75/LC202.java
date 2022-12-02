package leetcode.leetcode75;

import java.util.HashSet;
import java.util.Set;

/**
 * 202. Happy Number
 */
public class LC202 {

    /**
     * Write an algorithm to determine if a number n is happy.
     * <p>
     * A happy number is a number defined by the following process:
     * <p>
     * Starting with any positive integer, replace the number by the sum of the squares of its digits.
     * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
     * Those numbers for which this process ends in 1 are happy.
     * Return true if n is a happy number, and false if not.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: n = 19
     * Output: true
     * Explanation:
     * 12 + 92 = 82
     * 82 + 22 = 68
     * 62 + 82 = 100
     * 12 + 02 + 02 = 1
     * Example 2:
     * <p>
     * Input: n = 2
     * Output: false
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= n <= 231 - 1
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    static Set<Integer> sameNumSet = new HashSet<>();

    public static boolean isHappy(int n) {
        int sum = 0;
        if (n == 1) return true;
        char[] nums = String.valueOf(n).toCharArray();
        for (char num : nums) {
            sum += (num - '0') * (num - '0');
        }
        if (sameNumSet.contains(sum)) return false;
        sameNumSet.add(sum);
        if (sum == 1) return true;
        return isHappy(sum);
    }

}
