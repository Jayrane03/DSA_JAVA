package Graphs.DFS;
import java.util.*;

// For disconnected components in the graph
public class dfs {
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

        graph[6].add(new Edge(6, 5));
    }

    public static void dfs(ArrayList<Edge>[] graph, int current, boolean vis[]) {
        if (vis[current]) return; // Check if already visited (prevents infinite recursion)

        System.out.print(current + " ");
        vis[current] = true;

        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if (!vis[e.dest]) { // Visit only unvisited nodes
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph); // Create the graph before traversal

        System.out.println("DFS Traversal:");
        boolean[] visDFS = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visDFS[i]) {
                dfs(graph, i, visDFS);
            }
        }
    }
}