package leetcode;

/**
 * 33 Search in Rotated Sorted Array
 */
public class LC33 {

    /**
     * Runtime: 1 ms, faster than 76.26% of Java online submissions for Search in Rotated Sorted Array.
     * Memory Usage: 43.3 MB, less than 6.75% of Java online submissions for Search in Rotated Sorted Array.
     * @param nums
     * @param target
     * @return
     */
    private static int search(int[] nums, int target) {
        int a = 0;
        for (int num : nums) {
            if (num == target) {
                return a;
            }
            a++;
        }
        return -1;
    }

}
