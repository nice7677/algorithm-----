package leetcode.bs;

/**
 * LEETCODE 35. Search Insert Position
 */
public class LC35 {

    public static void main(String[] args) {
        LC35 lc35 = new LC35();
        int result = lc35.searchInsert(new int[]{1, 3, 5, 6}, 5);
        System.out.println(result);
        System.out.println(result == 2);
        int result2 = lc35.searchInsert(new int[]{1, 3, 5, 6}, 2);
        System.out.println(result2);
        System.out.println(result2 == 1);
        int result3 = lc35.searchInsert(new int[]{1, 3, 5, 6}, 7);
        System.out.println(result3);
        System.out.println(result3 == 4);
    }

    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            }

            if (nums[mid] > target) {
                right = mid - 1;
            }

        }

        return left;

    }

}
