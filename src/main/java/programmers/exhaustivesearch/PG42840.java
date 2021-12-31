package programmers.exhaustivesearch;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Programmers 42840
 * 완전탐색
 * 모의고사
 */
public class PG42840 {

    public int[] solution(int[] answers) {
        int[][] pattern = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        Map<Integer, Integer> mathGiveUpErMap = new ConcurrentHashMap<>();
        for (int p = 0; p < pattern.length; p++) {
            for (int i = 0; i < answers.length; i++) {
                if (answers[i] == pattern[p][i % pattern[p].length])
                    mathGiveUpErMap.put(p + 1, mathGiveUpErMap.get(p + 1) == null ? 1 : mathGiveUpErMap.get(p + 1) + 1);
            }
        }
        int max = Collections.max(mathGiveUpErMap.values());
        return mathGiveUpErMap.entrySet().stream()
                .filter(item -> item.getValue() == max)
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .mapToInt(item -> item.getKey().intValue())
                .toArray();
    }

}
