package leetcode;

/**
 * LeetCode 1150. Check If a Number Is Majority Element in a Sorted Array
 */
public class LC1150 {

    public static void main(String[] args) {
        LC1150 lc1150 = new LC1150();
        System.out.println(lc1150.isMajorityElement(new int[]{10,100,101,101}, 101));
    }

    /**
     * 100%다 기분이 좋다
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Check If a Number Is Majority Element in a Sorted Array.
     * Memory Usage: 42.3 MB, less than 32.68% of Java online submissions for Check If a Number Is Majority Element in a Sorted Array.
     * @param nums
     * @param target
     * @return
     */
    public boolean isMajorityElement(int[] nums, int target) {
        double half = nums.length / 2;
        int count = 0;
        for (int num : nums) {
            if (num == target) count++;
        }
        if (count > half) return true;
        return false;
    }

}
