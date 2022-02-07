package leetcode.algorithm.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 283. Move Zeroes
 */
public class LC283 {

    public static void main(String[] args) {
        moveZeroes(new int[]{4,2,4,0,0,3,0,5,1,0});
    }

    /**
     * Runtime: 4 ms, faster than 21.13% of Java online submissions for Move Zeroes.
     * Memory Usage: 43.4 MB, less than 63.50% of Java online submissions for Move Zeroes.
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        List<Integer> numsList = new ArrayList<>();
        for (int num : nums) {
            if (num != 0) numsList.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            if (i >= numsList.size()) {
                nums[i] = 0;
            } else {
                nums[i] = numsList.get(i);
            }
        }
    }

}
