package programmers.exhaustivesearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Programmers 42839
 * 완전탐색
 * 소수 찾기
 */
public class PG42839 {

    public static void main(String[] args) {
        System.out.println(solution("011"));
    }

    static List<Integer> result = new ArrayList<>();

    public static int solution(String numbers) {
        String[] numbersSplit = numbers.split("");
        String[] output = new String[numbers.length()];
        boolean[] visited = new boolean[numbers.length()];
        for (int i = 1; i <= numbers.length(); i++) {
            perm(numbersSplit, 0, numbers.length(), i, output, visited);
        }
        return result.size();
    }

    // visited,
    public static void perm(String[] arr, int depth, int n, int r, String[] output, boolean[] visited) {
        if (depth == r) {
            String s = "";
            for (int i = 0; i < r; i++) {
                // arr가 아닌 output으로
                s += output[i];
            }
            int sInt = Integer.parseInt(s);
            if (isPrime(sInt) && !result.contains(sInt)) {
                result.add(sInt);
            }
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, depth + 1, n, r, output, visited);
                visited[i] = false;
            }
        }
    }

    // 소수
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        for (int i = 2; i < number; i++) if (number % i == 0) return false;
        return true;
    }

}
