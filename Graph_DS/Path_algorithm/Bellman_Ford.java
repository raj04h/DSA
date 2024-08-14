package Path_algorithm;

import java.util.ArrayList;

public class Bellman_Ford {
    static class Edge {
        int src;
        int dest;
        int wt; // Weight of the edge

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));// wt=-10 then it is negative weight cycle
    }

    static void ford(ArrayList<Edge>[] graph, int src, int V) {
        int dist[] = new int[V];

        // Initialize distances from src to all other vertices as INFINITE
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;

        // Relax all edges |V| - 1 times.
        for (int i = 0; i < V - 1; i++) {
            for (int u = 0; u < V; u++) {
                for (Edge edge : graph[u]) {
                    int v = edge.dest;
                    int weight = edge.wt;
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                        dist[v] = dist[u] + weight;
                    }
                }
            }
        }

        // Check for negative-weight cycles.
        for (int u = 0; u < V; u++) {
            for (Edge edge : graph[u]) {
                int v = edge.dest;
                int weight = edge.wt;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    System.out.println("Graph contains negative weight cycle");
                    return;
                }
            }
        }

        // Print all distances
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        ford(graph, 0, V);
    }
}
