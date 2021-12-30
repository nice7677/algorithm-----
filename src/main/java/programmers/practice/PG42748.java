package programmers.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Programmers 42748
 * 정렬
 * K번째수
 */
public class PG42748 {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int a = 0;
        for (int[] command : commands) {
            List<Integer> arr = new ArrayList<>();
            for (int i = command[0] - 1; i <= command[1] - 1; i++) {
                arr.add(array[i]);
            }
            answer[a] = arr.stream().sorted().collect(Collectors.toList()).get(command[2] - 1);
            a++;
        }
        return answer;
    }

}
