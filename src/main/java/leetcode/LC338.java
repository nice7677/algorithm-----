package leetcode;

import java.util.Arrays;

/**
 * LeetCode 338. Counting Bits
 */
public class LC338 {

    public static void main(String[] args) {
        System.out.println(countBits(30));
    }

    /**
     * Bit 공부 연습 필요함
     * Runtime: 67 ms, faster than 5.40% of Java online submissions for Counting Bits.
     * Memory Usage: 83.9 MB, less than 5.05% of Java online submissions for Counting Bits.
     * @param n
     * @return
     */
    public static int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            String bits = Integer.toBinaryString(i);
            char[] bitsCharArray = bits.toCharArray();
            int sum = 0;
            for (char bit : bitsCharArray) {
                sum += Integer.valueOf(String.valueOf(bit));
            }
            result[i] = sum;
        }
        return result;
    }


}
