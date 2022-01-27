package leetcode.datastructure.day.three;

import java.util.*;

/**
 * 350. Intersection of Two Arrays II
 */
public class LC350 {


    /**
     * Given two integer arrays nums1 and nums2, return an array of their intersection.
     * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4}));
    }

    /**
     * 문제를 처음에 잘못이해했다. 정렬된 순서되로 중복값인줄 알았는데 그냥 아무곳에나 중복으로 되있으면 되는거더라
     * Runtime: 5 ms, faster than 34.30% of Java online submissions for Intersection of Two Arrays II.
     * Memory Usage: 44.1 MB, less than 5.46% of Java online submissions for Intersection of Two Arrays II.
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return intersect(nums2, nums1);
        Map<Integer, Integer> m = new HashMap<>();
        for (int n : nums1) m.put(n, m.getOrDefault(n, 0) + 1);
        int k = 0;
        for (int i = 0; i < nums2.length; i++) {
            int cnt = m.getOrDefault(nums2[i], 0);
            if (cnt > 0) {
                nums1[k++] = nums2[i];
                m.put(nums2[i], cnt - 1);
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }

}
