package programmers.sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Programmers 42746
 * 정렬
 * 가장 큰 수
 */
public class PG42746 {

    public String solution(int[] numbers) {
        String answer = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((o1, o2) -> (o2 + o1).compareTo(o1 + o2))
                .reduce((s1, s2) -> s1 + s2).get();
        return answer.startsWith("0") ? "0" : answer;
    }

}
