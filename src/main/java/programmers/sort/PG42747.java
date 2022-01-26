package programmers.sort;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @Programmers 42747
 * 정렬
 * H-Index
 */
public class PG42747 {

    public int solution(int[] citations) {
        AtomicInteger index = new AtomicInteger();
        return Arrays.stream(citations)
                .sorted()
                .boxed()
                .filter(value -> value >= citations.length - index.getAndIncrement())
                .collect(Collectors.toList()).size();
    }

}
