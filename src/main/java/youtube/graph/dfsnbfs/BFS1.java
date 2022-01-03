package youtube.graph.dfsnbfs;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BFS1 {

    public static void main(String[] args) {
        int[][] graph = {
                {},
                {2, 3, 8},
                {1, 7},
                {1, 4, 5},
                {3, 5},
                {3, 4},
                {7},
                {2, 6, 8},
                {1, 7},
        };
        boolean[] visited = new boolean[graph.length];
        bfs(graph, 1, visited);
    }

    static Queue<Integer> queue = new LinkedBlockingQueue<>();

    static void bfs(int[][] graph, int start, boolean[] visited) {
        queue.offer(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            // x는 계속 바낌
            int x = queue.poll();
            System.out.println("Current poll data is '" + x + "' in queue");
            for (int i : graph[x])
                if (!visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
        }
    }

}
