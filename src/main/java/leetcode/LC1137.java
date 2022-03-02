package leetcode;

/**
 * LeetCode 1137. N-th Tribonacci Number
 */
public class LC1137 {

    public static void main(String[] args) {
        System.out.println(tribonacci(4));
    }

    public static int tribonacci(int n) {
        if (n < 3) return n == 0 ? 0 : 1;
        int tmp, x = 0, y = 1, z = 1;
        for (int i = 3; i <= n; ++i) {
            tmp = x + y + z;
            x = y;
            y = z;
            z = tmp;
        }
        return z;
    }

}
