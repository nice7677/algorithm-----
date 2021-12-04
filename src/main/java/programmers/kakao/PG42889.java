package programmers.kakao;

import java.util.*;

/**
 * Programmers 42889
 * 2019 KAKAO BLIND RECRUITMENT
 * 실패율
 */
public class PG42889 {

    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        double userCount = stages.length;
        Map<Integer, Integer> stageMap = new HashMap<>();
        for (int i = 0; i < stages.length; i++) {
            stageMap.put(stages[i], (stageMap.get(stages[i]) != null) ? stageMap.get(stages[i]) + 1 : 1);
        }
        Map<Double, List<Integer>> failedRateMap = new HashMap<>();
        List<Double> sort = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            double rate = (stageMap.get(i) != null ? stageMap.get(i) / userCount : 0);
            List<Integer> stageList = null;
            if (failedRateMap.get(rate) != null) {
                stageList = failedRateMap.get(rate);
                stageList.add(i);
                failedRateMap.put(rate, stageList);
            } else {
                stageList = new ArrayList<>();
                stageList.add(i);
                failedRateMap.put(rate, stageList);
            }
            userCount -= (stageMap.get(i) != null ? stageMap.get(i) : 0);
            if (!sort.contains(rate)) sort.add(rate);
        }
        Collections.sort(sort, Collections.reverseOrder());
        int i = 0;
        for (Double rate : sort) {
            for (Integer integer : failedRateMap.get(rate)) {
                answer[i] = integer;
                i++;
            }
        }
        return answer;
    }

}
