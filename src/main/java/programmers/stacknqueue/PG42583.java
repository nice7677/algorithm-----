package programmers.stacknqueue;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Programmers 42583
 *
 */
public class PG42583 {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0, sum = 0;
        Queue<Integer> truckQueue = new LinkedBlockingQueue<>();
        Queue<Integer> bridgeQueue = new LinkedBlockingQueue<>();
        for (int truck_weight : truck_weights) {
            truckQueue.add(truck_weight);
        }
        for (int i = 0; i < bridge_length; i++) {
            bridgeQueue.add(0);
        }
        while (truckQueue.size() > 0) {
            if (bridgeQueue.peek() == null) {
                bridgeQueue.add(truckQueue.poll());
                sum += bridgeQueue.peek();
            } else {
                if (bridgeQueue.size() == bridge_length) {
                    sum -= bridgeQueue.poll();
                }
                if (sum + truckQueue.peek() <= weight) {
                    int truckWeight = truckQueue.poll();
                    bridgeQueue.add(truckWeight);
                    sum += truckWeight;
                } else {
                    if (bridgeQueue.size() != bridge_length && bridge_length > bridgeQueue.size()) {
                        bridgeQueue.add(0);
                    } else if (bridgeQueue.size() == bridge_length){
                        int truckWeightOnBridge = bridgeQueue.poll();
                        sum -= truckWeightOnBridge;
                        if (sum + truckQueue.peek() < weight) {
                            int truckWeight = truckQueue.poll();
                            bridgeQueue.add(truckWeight);
                            sum += truckWeight;
                        }
                    }
                }
            }
            answer++;
        }
        while (bridgeQueue.size() > 0) {
            bridgeQueue.poll();
            answer++;
        }
        return answer;
    }

}
