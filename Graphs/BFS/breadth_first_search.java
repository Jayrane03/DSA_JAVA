package Graphs.BFS;
import java.util.*;

public class breadth_first_search {
    static class Edge {
        int src, dest;
        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>(); // Initialize adjacency list
        }

        // Adding edges to the graph
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5)); // Fixed misplaced edge addition
    }

    public static void bfs(ArrayList<Edge>[] graph, int V) {  //O(V+E)
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[V];

        q.add(0);
        vis[0] = true; // Mark the starting node as visited

        while (!q.isEmpty()) {
            int current = q.poll();
            System.out.print(current + " "); // Print BFS traversal result

            // Find neighbors
            for (Edge e : graph[current]) {
                if (!vis[e.dest]) {
                    q.add(e.dest);
                    vis[e.dest] = true; // Mark visited before adding to avoid duplicates
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        bfs(graph, V);
        System.out.println();
    }
}
