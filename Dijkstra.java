package Path_algorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {
    static class Edge {
        int src;
        int dest;
        int wt; // Weight of the edge

        public Edge(int s, int d, int weight) {
            this.src = s;
            this.dest = d;
            this.wt = weight;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 4, 5));
        
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 4, 2));
        
        graph[2].add(new Edge(2, 3, 4));
        
        graph[3].add(new Edge(3, 2, 6));
        graph[3].add(new Edge(3, 0, 7));
        
        graph[4].add(new Edge(4, 2, 3));
        graph[4].add(new Edge(4, 3, 9));
        graph[4].add(new Edge(4, 5, 2));
        
        graph[5].add(new Edge(5, 3, 6));
    }

    static class Pair implements Comparable<Pair> {
        int node;
        int dist;

        public Pair(int n, int d) {
            this.node = n;
            this.dist = d;
        }

        @Override
        public int compareTo(Pair p2) {
            return Integer.compare(this.dist, p2.dist); // ascending order sorting
        }
    }

    static void dijkstra(ArrayList<Edge>[] graph, int src, int v) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] dist = new int[v];

        for (int i = 0; i < v; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;
        boolean[] vis = new boolean[v];

        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if (!vis[curr.node]) {
                vis[curr.node] = true;

                for (Edge e : graph[curr.node]) {
                    int u = e.src;
                    int w = e.dest;
                    int weight = e.wt;

                    if (dist[u] + weight < dist[w]) { // relaxation
                        dist[w] = dist[u] + weight;
                        pq.add(new Pair(w, dist[w]));
                    }
                }
            }
        }

        for (int i = 0; i < v; i++) {
            System.out.print(dist[i] + " ");
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }
        createGraph(graph);
        dijkstra(graph, 0, v);
    }
}
