package leetcode.heap.easy;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @LeetCode 1046
 * Last Stone Weight
 * 큐에서 돌맹이 2개 뽑아서 처리하는 문제
 */
public class LC1046 {

    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
        System.out.println(lastStoneWeight(new int[]{1}));
    }

    static int lastStoneWeight(int[] stones) {
        int result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            pq.offer(stone);
        }
        while (true) {
            if (pq.size() == 1 || pq.isEmpty()) {
                break;
            }
            int y = pq.poll();
            int x = pq.poll();
            if (x != y) pq.offer(y - x);
        }
        if (pq.size() == 1) result = pq.poll();
        return result;
    }

}

/**
 *
 * Runtime: 3 ms, faster than 19.27% of Java online submissions for Last Stone Weight.
 * Memory Usage: 38.4 MB, less than 13.63% of Java online submissions for Last Stone Weight.
 *
 */
