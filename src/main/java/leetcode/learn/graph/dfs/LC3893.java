package leetcode.learn.graph.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * @LeetCode Find if Path Exists in Graph
 */
public class LC3893 {

    public static void main(String[] args) {
        System.out.println(validPath(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}, 0, 2));
    }

    /**
     * There is a bi-directional graph with n vertices,
     * where each vertex is labeled from 0 to n - 1 (inclusive).
     * The edges in the graph are represented as a 2D integer array edges,
     * where each edges[i] = [ui, vi] denotes a bi-directional edge between vertex ui and vertex vi.
     * Every vertex pair is connected by at most one edge, and no vertex has an edge to itself.
     * <p>
     * You want to determine if there is a valid path that exists from vertex start to vertex end.
     * <p>
     * Given edges and the integers n, start, and end, return true if there is a valid path from start to end, or false otherwise.
     *
     * @param n
     * @param edges
     * @param start
     * @param end
     * @return
     */
    public static boolean validPath(int n, int[][] edges, int start, int end) {
        boolean[] visited = new boolean[n];
        return dfs(edges, n, 0, start, end, visited);
    }

    public static boolean dfs(int[][] edges, int n, int v, int start, int end, boolean[] visited) {
        visited[v] = true;

    }

    class Node {

        int val;
        List<Node> nodes = new ArrayList<>();

        public void addNode(Node node) {
        }
        
    }

}
