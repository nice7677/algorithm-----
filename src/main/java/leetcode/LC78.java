package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode 78. Subsets
 */
public class LC78 {

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1, 2, 3}));
    }

    /**
     * 오쉣; 100% 나왔다 기분이 좋다.
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Subsets.
     * Memory Usage: 43.6 MB, less than 8.40% of Java online submissions for Subsets.
     * @param nums
     * @return
     */
    public static List<List<Integer>> subsets(int[] nums) {
        var result = new ArrayList<List<Integer>>();
        int n = nums.length;
        boolean[] visited = new boolean[n];
        for (int i = 0; i <= n; i++) {
            combination(nums, visited, 0, n, i, result);
        }
        return result;
    }

    static void combination(int[] arr, boolean[] visited, int start, int n, int r, List<List<Integer>> result) {
        if (r == 0) {
            var numsList = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    numsList.add(arr[i]);
                }
            }
            result.add(numsList);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1,result);
            visited[i] = false;
        }
    }

}
