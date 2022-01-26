package youtube.greedy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Greedy3 {

    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{2, 3, 1, 2, 2}));
    }

    static int solution(int n, int[] x) {
        int[] xX = x;
        return Arrays.stream(x)
                .distinct()
                .filter(value -> value >= getCount(xX, value))
                .boxed()
                .collect(Collectors.toList())
                .size();
    }

    static int getCount(int[] x, int v) {
        return x.length - Arrays.stream(x)
                .filter(value -> value >= v)
                .boxed()
                .collect(Collectors.toList())
                .size();
    }

}
