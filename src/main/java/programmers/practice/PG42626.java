package programmers.practice;

import java.util.PriorityQueue;

/**
 * @Programmers 42626
 * 힙(Heap)
 * 더 맵게
 */
public class PG42626 {

    /**
     * @PriorityQueue 우선순위 큐, 우선순위를 설정할 수 있음
     * @param scoville
     * @param K
     * @return
     */
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i : scoville) {
            priorityQueue.add(i);
        }
        while (priorityQueue.peek() < K) {
            if (priorityQueue.size() > 1) {
                int a = priorityQueue.remove();
                int b = priorityQueue.remove();
                priorityQueue.add(a + (b * 2));
                answer++;
            } else {
                return -1;
            }
        }
        return answer;
    }

}
