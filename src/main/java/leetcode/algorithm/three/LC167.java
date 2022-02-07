package leetcode.algorithm.three;

import java.util.HashMap;
import java.util.Map;

/**
 * 167. Two Sum II - Input Array Is Sorted
 */
public class LC167 {

    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2,3,4}, 6));
    }

    /**
     * Runtime: 3 ms, faster than 21.94% of Java online submissions for Two Sum II - Input Array Is Sorted.
     * Memory Usage: 44.1 MB, less than 13.28% of Java online submissions for Two Sum II - Input Array Is Sorted.
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> needValueAndIndex = new HashMap<>();
        int[] result = new int[2];
        int i = 0;
        for (int number : numbers) {
            if (needValueAndIndex.get(number) != null) {
                result[0] = needValueAndIndex.get(number) + 1;
                result[1] = i + 1;
                return result;
            } else {
                needValueAndIndex.put(target - number, i);
            }
            i++;
        }
        return result;
    }

}
