package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Baekjoon 1260
 * DFS와 BFS
 */
public class PG1260 {

    static int n, m, v;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        Graph g = new Graph(m);
        for (int i = 0; i < m; i++) {
            String edge = br.readLine();
            StringTokenizer st1 = new StringTokenizer(edge, " ");
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());
            g.addEdge(a, b);
            System.out.println(i);
        }
        g.dfs(v);

    }

    static class Graph {

        class Node {
            int data;
            LinkedList<Node> adjList;
            boolean marked;

            public Node(int data) {
                this.data = data;
                this.marked = false;
                this.adjList = new LinkedList<>();
            }
        }

        Node[] nodes;

        Graph(int size) {
            nodes = new Node[size];
            for (int i = 0; i < size; i++) {
                nodes[i] = new Node(i);
            }
        }

        void addEdge(int i1, int i2) {
            Node n1 = nodes[i1];
            Node n2 = nodes[i2];
            if (!n1.adjList.contains(n2)) n1.adjList.add(n2);
            if (!n2.adjList.contains(n1)) n2.adjList.add(n1);
        }

        void dfs(int start) {
            Node root = nodes[start];
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            root.marked = true;
            while (!stack.empty()) {
                Node r = stack.pop();
                for (Node n : r.adjList) {
                    if (n.marked == false) {
                        n.marked = true;
                        stack.push(n);
                    }
                }
                System.out.print(r.data);
            }
        }
    }

}
