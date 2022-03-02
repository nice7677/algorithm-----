package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 169. Majority Element
 */
public class LC169 {

    public static void main(String[] args) {
        LC169 lc169 = new LC169();
        lc169.majorityElement(new int[]{1, 3, 1, 1, 4, 1, 1, 5, 1, 1, 6, 2, 2});
    }

    /**
     * Runtime: 15 ms, faster than 22.98% of Java online submissions for Majority Element.
     * Memory Usage: 55.6 MB, less than 46.03% of Java online submissions for Majority Element.
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int num : nums) {
            if (numsMap.containsKey(num)) numsMap.put(num, numsMap.get(num) + 1);
            else numsMap.put(num, 1);
        }
        int num = 0;
        int count = 0;
        for (Integer key : numsMap.keySet()) {
            if (numsMap.get(key) > count) {
                num = key;
                count = numsMap.get(key);
            } else if (numsMap.get(key) == count) {
                if (key > num) {
                    num = key;
                    count = numsMap.get(key);
                }
            }
        }
        return num;
    }

}
