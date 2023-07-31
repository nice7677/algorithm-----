package leetcode.bs;

/**
 * 34. Find First and Last Position of Element in Sorted Array
 */
public class LC34 {

    public static void main(String[] args) {

        LC34 lc34 = new LC34();
        int[] result = lc34.searchRange(new int[]{5,7,7,8,8,10}, 8);
        System.out.println(result[0] == 3 && result[1] == 4);
//        int[] result2 = lc34.searchRange(new int[]{5,7,7,8,8,10}, 6);
//        System.out.println(result2 == new int[]{-1, -1});
//        int[] result3 = lc34.searchRange(new int[]{}, 0);
//        System.out.println(result3 == new int[]{-1, -1});

    }

    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[2];
        if (nums.length == 0) {
            result = new int[]{-1, -1};
            return result;
        }
        result[0] = findLeftIndex(nums, target);
        result[1] = findRightIndex(nums, target);

        return result;
    }

    private int findRightIndex(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            if (nums[mid] == target) {
                index = mid;
            }
        }

        return index;

    }

    private int findLeftIndex(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

            if (nums[mid] == target) {
                index = mid;
            }
        }

        return index;

    }

}
