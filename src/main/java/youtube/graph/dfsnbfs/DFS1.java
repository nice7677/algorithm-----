package youtube.graph.dfsnbfs;

public class DFS1 {

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
        dfs(graph, 1, visited);
    }

    static void dfs(int[][] graph, int v, boolean[] visited) {
        visited[v] = true;
        System.out.println("Current visited number is '" + v + "'");
        for (int i : graph[v]) if (visited[i] == false) dfs(graph, i, visited);
    }

}
