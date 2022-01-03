package programmers.graph.dfsnbfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Programmers 43162
 * 깊이/너비 우선 탐색(DFS/BFS)
 * 네트워크
 */
public class PG43162 {

    public static void main(String[] args) {
        System.out.println(solution(3, new int[][]{
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}}));
    }

    static int answer = 0;

    static int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[computers.length];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, computers, visited);
                answer++;
            }
        }
        return answer;
    }

    static void dfs(int n, int[][] computers, boolean[] visited) {
        if (n == computers.length) return;
        visited[n] = true;
        for (int i = 0; i < computers.length; i++) {
            if (!visited[i] && computers[n][i] == 1) {
                dfs(i, computers, visited);
            }
        }
    }

}
