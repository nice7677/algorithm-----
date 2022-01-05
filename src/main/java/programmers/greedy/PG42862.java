package programmers.greedy;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Programmers 42862
 * 탐욕법(Greedy)
 * 체육복
 */
public class PG42862 {

    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        Map<String, Integer> studentsMap = new ConcurrentHashMap<>();
        Map<String, Integer> reserveMap = new ConcurrentHashMap<>();
        for (int i = 1; i <= n; i++) studentsMap.put("S" + i, i);
        for (int i : reserve) reserveMap.put("S" + i, i);
        for (int i : lost) {
            if (reserveMap.get("S" + i) != null) reserveMap.remove("S" + i);
            studentsMap.remove("S" + i);
        }
        for (String key : reserveMap.keySet()) {
            int i = reserveMap.get(key);
            if (studentsMap.get("S" + (i - 1)) == null && (i - 1) != 0) {
                studentsMap.put("S" + (i - 1), (i - 1));
                continue;
            }
            if (studentsMap.get("S" + (i + 1)) == null && (i + 1) <= n) {
                studentsMap.put("S" + (i + 1), (i + 1));
                continue;
            }
        }
        return studentsMap.size();
    }

}
