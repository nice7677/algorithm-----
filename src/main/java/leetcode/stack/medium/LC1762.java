package leetcode.stack.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @LeetCode 1762
 * Buildings With an Ocean Views
 */
public class LC1762 {

    public static void main(String[] args) {
        System.out.println(findBuildings(new int[]{4, 2, 3, 1}));
    }

    /**
     * Runtime: 14 ms, faster than 30.92% of Java online submissions for Buildings With an Ocean View.
     * Memory Usage: 57.8 MB, less than 24.17% of Java online submissions for Buildings With an Ocean View.
     * @param heights
     * @return
     */
    public static int[] findBuildings(int[] heights) {
        List<Integer> index = new ArrayList<>();
        int biggest = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            if (i == heights.length - 1) {
                index.add(i);
                biggest = heights[i];
            } else {
                if (i != 0) {
                    if (heights[i] > heights[i + 1] && heights[i] > biggest) {
                        index.add(i);
                        biggest = heights[i];
                    }
                } else if (i == 0) {
                    if (heights[0] > biggest) {
                        index.add(0);
                    }
                }
            }
        }
        return index.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

}
