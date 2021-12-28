package programmers.practice;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Programmers 42586
 * 스택/큐
 * 기능개발
 */
public class PG42586 {

    /**
     * TODO ------------
     * @param progresses
     * @param speeds
     * @return
     */
    public int[] solution(int[] progresses, int[] speeds) {
        Map<Integer, Integer> progressesMap = new ConcurrentHashMap<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> queue = new LinkedList<>();
        int[] answer = {};
        int i = 0;
        for (int progress : progresses) {
            double day = Math.ceil((100 - (double) progress) / (double) speeds[i]);
            i++;
            if (priorityQueue.isEmpty() || day > priorityQueue.peek()) {
                priorityQueue.add((int) day);
                queue.add((int) day);
                progressesMap.put(
                        (int) day, 1);
            } else if (priorityQueue.peek() >= day) {
                progressesMap.put(
                        priorityQueue.peek(),
                        progressesMap.get(priorityQueue.peek()) + 1);
            }
        }
        answer = new int[priorityQueue.size()];
        for (i = 0; i < progressesMap.size(); i++) {
            answer[i] = progressesMap.get(queue.poll());
        }
        return answer;
    }

}
