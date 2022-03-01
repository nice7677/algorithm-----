package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Sorting
 * LeetCode 75. Sort Colors
 */
public class LC75 {

    public static void main(String[] args) {
        LC75 lc75 = new LC75();
        lc75.sortColors(new int[]{2,0,2,1,1,0});
    }

    /**
     * Swap을 하면 더 좋을것으로 생각. 자야되서 이렇게함 내일 Swap으로 다시
     * Runtime: 3 ms, faster than 5.76% of Java online submissions for Sort Colors.
     * Memory Usage: 42.7 MB, less than 20.18% of Java online submissions for Sort Colors.
     * @param nums
     */
    public void sortColors(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int num : nums) {
            if (numsMap.containsKey(num)) numsMap.put(num, numsMap.get(num) + 1);
            else numsMap.put(num, 1);
        }
        int i = 0;
        for (Integer integer : numsMap.keySet()) {
            for (int j = 0; j < numsMap.get(integer); j++) {
                nums[i] = integer;
                i++;
            }
        }
    }

}
