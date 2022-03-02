package leetcode;

/**
 * LeetCode 509. Fibonacci Number
 */
public class LC509 {

    public static void main(String[] args) {
        System.out.println(fib(4));
    }

    /**
     * Runtime: 7 ms, faster than 35.39% of Java online submissions for Fibonacci Number.
     * Memory Usage: 38.7 MB, less than 52.73% of Java online submissions for Fibonacci Number.
     * @param n
     * @return
     */
    public static int fib(int n) {
        int result = n;
        if (n > 1) {
            return fib(n - 1) + fib(n - 2);
        }
        return result;
    }

}
