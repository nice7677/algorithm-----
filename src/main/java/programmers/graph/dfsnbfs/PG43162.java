package programmers.graph.dfsnbfs;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Programmers 43162
 * 깊이/너비 우선 탐색(DFS/BFS)
 * 네트워크
 */
public class PG43162 {

    public static void main(String[] args) {
        System.out.println(solution(4, new int[][]{
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 0, 1, 1},
                {1, 0, 1, 1}}
        ));
    }

    public static int solution(int n, int[][] computers) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            // 1인 값인 경우에 시작, 만약 마킹이 첫번째에 끝났다면 1이겠지?
            if (computers[i][i] == 1) {
                //먼저 본인 잡고 본인 주변을 dfs로 다 마킹함
                answer++;
//                dfs(computers, i);
                bfs(computers, i);
            }
        }
        return answer;
    }

    public static void dfs(int[][] computers, int v) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[v][i] == 1) {
                computers[v][i] = computers[i][v] = 0;
                dfs(computers, i);
            }
        }
    }

    public static void bfs(int[][] computers, int v) {
        // 큐 생성
        Queue<Integer> queue = new LinkedBlockingQueue<>();
        // 큐 삽입
        queue.offer(v);
        // 마크
        computers[v][v] = 0;
        while (!queue.isEmpty()) { // 없어질때까지
            int x = queue.poll(); // x 빼오기
            for (int i = 0; i < computers.length; i++) {
                // y축 돌리기
                if (computers[x][i] == 1) { // xy = 1
                    queue.add(i); // 넣고
                    // 마크
                    computers[x][i] = computers[i][x] = 0;
                }
            }
        }
    }

}
