package programmers.graph.dfsnbfs;

/**
 * Programmers 43165
 * 깊이/너비 우선 탐색(DFS/BFS)
 * 타겟 넘버
 */
public class PG43165 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 1, 1, 1}, 3));
    }

    static int answer = 0;
    static int count = 0;

    static int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }

    static void dfs(int[] numbers, int target, int index, int sum) {
        count++;
        System.out.println("Index : " + index + ", Answer : " + answer + ", Count : " + count);
        if (index == numbers.length) {
            if (sum < 1) return;
            if (sum == target) answer++;
            return;
        }
        dfs(numbers, target, index + 1, sum + numbers[index]);
        dfs(numbers, target, index + 1, sum - numbers[index]);
    }
}