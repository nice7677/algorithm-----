package leetcode;

/**
 * LeetCode 70. Climbing Stairs
 */
public class LC70 {

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n) {
        if (n == 1) return 1;
        int[] dp = new int[n + 1];
        dp[1] = 1; // 1 고정
        dp[2] = 2; // 2 고정
        // 3부터 시작
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; // left right sum
        }
        return dp[n];
    }

}
