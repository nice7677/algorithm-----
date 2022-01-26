package leetcode.sorted.easy;

import java.util.Arrays;

/**
 * @LeetCode 1365
 * How Many Numbers Are Smaller Than the Current Number
 */
public class LC1365 {

    public static void main(String[] args) {
        System.out.println(smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3}));
    }

    /**
     * 2중 포문이라 개구려서 그런가보다.
     * Runtime: 28 ms, faster than 6.29% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
     * Memory Usage: 41.6 MB, less than 7.34% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
     */
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] > nums[j]) {
                    count[i] += 1;
                }
            }
        }
        return count;
    }

}