package programmers.graph;

/**
 * Programmers 43165
 * 깊이/너비 우선 탐색(DFS/BFS)
 * 타겟 넘버
 */
public class PG43165 {

    int i = 1;

    public int solution(int[] numbers, int target) {
        int answer = 0;

        answer = bfs(numbers, target, numbers[0]) + bfs(numbers, target, -numbers[0]);

        return answer;
    }

    public int bfs(int[] numbers, int target, int sum) {

        if (i == numbers.length) {
            if (sum == target) return 1;
            else return 0;
        }

        int result = 0;
        result += bfs(numbers, target, sum + numbers[i]);
        result += bfs(numbers, target, sum - numbers[i]);
        i++;

        return result;
    }

}
