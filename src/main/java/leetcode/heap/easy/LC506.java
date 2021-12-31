package leetcode.heap.easy;

import java.util.Collections;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @LeetCode 506
 * Relative Ranks
 */
public class LC506 {

    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int item : score) {
            priorityQueue.add(item);
        }
        Map<Integer, Integer> map = new ConcurrentHashMap<>();
        int i = 1;
        while (!priorityQueue.isEmpty()) {
            map.put(priorityQueue.poll(), i);
            i++;
        }
        String[] scoreStr = new String[score.length];
        i = 0;
        for (int item : score) {
            int rank = map.get(item);
            String result = "";
            if (rank == 1) result = "Gold Medal";
            else if (rank == 2) result = "Silver Medal";
            else if (rank == 3) result = "Bronze Medal";
            else result = String.valueOf(rank);
            scoreStr[i] = result;
            i++;
        }
        return scoreStr;
    }

}
