package youtube.graph.dfsnbfs;

public class DFS2 {

    static int n = 4, m = 5;
    static int[][] graph = {
            {0, 0, 1, 1, 0},
            {0, 0, 0, 1, 1},
            {1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0},
    };

    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i < n; i++) for (int j = 0; j < m; j++) if (dfs(i, j)) result++;
        System.out.println(result);
    }

    static boolean dfs(int startX, int startY) {
        if (startX <= -1 || startX >= n || startY <= -1 || startY >= m) {
            return false;
        }
        if (graph[startX][startY] == 0) {
            graph[startX][startY] = 1;
            dfs(startX - 1, startY);
            dfs(startX + 1, startY);
            dfs(startX, startY - 1);
            dfs(startX, startY + 1);
            return true;
        }
        return false;
    }

}
