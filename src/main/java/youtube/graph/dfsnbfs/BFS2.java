package youtube.graph.dfsnbfs;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BFS2 {

    static int n = 5, m = 6;
    static int[][] graph = {
            {1, 0, 1, 0, 1, 0},
            {1, 1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1}
    };
    static int[] dX = {-1, 1, 0, 0};
    static int[] dY = {0, 0, -1, 1};


    public static void main(String[] args) {
        System.out.println(bfs(0, 0));
    }


    static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedBlockingQueue<>();
        queue.offer(new int[]{x, y});
        while (!queue.isEmpty()) {
            int[] xy = queue.poll();
            x = xy[0];
            y = xy[1];
            for (int i = 0; i < 4; i++) {
                int nX = x + dX[i];
                int nY = y + dY[i];
                if (nX < 0 || nX >= n || nY < 0 || nY >= m) continue;
                if (graph[nX][nY] == 0) continue;
                if (graph[nX][nY] == 1) {
                    graph[nX][nY] = graph[x][y] + 1;
                    queue.offer(new int[]{nX, nY});
                }
            }
        }
        return graph[n - 1][m - 1];
    }


}
