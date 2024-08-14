package Path_algorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prim {
    static class Edge {
        int dest;
        int wt; // Weight of the edge

        public Edge(int s, int d, int weight) {
            this.dest = d;
            this.wt = weight;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        // Initialize the graph
        // Add edges as per your requirements
        // Example:
        // graph[0].add(new Edge(0, 1, 10));
        // graph[1].add(new Edge(1, 2, 5));
        // ...

        // For demonstration purposes, I'll use the provided example
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
        int weight;

        public Pair(int n, int w) {
            this.node = n;
            this.weight = w;
        }

        @Override
        public int compareTo(Pair p2) {
            return Integer.compare(this.weight, p2.weight); // ascending order sorting
        }
    }

    static void prim(ArrayList<Edge>[] graph, int vertices) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean[] inMST = new boolean[vertices];
        int[] minEdge = new int[vertices];
        int[] parent = new int[vertices]; // To track the MST
        int totalCost = 0; // To track the total cost of the MST

        for (int i = 0; i < vertices; i++) {
            minEdge[i] = Integer.MAX_VALUE;
            parent[i] = -1; // Initialize parent array
        }
        minEdge[0] = 0;
        pq.add(new Pair(0, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            int u = curr.node;
            int weight = curr.weight;

            if (inMST[u]) continue;

            inMST[u] = true;
            totalCost += weight; // Add weight to total cost

            // Print the edge in the MST
            if (parent[u] != -1) {
                System.out.println("Edge: " + parent[u] + " - " + u + " with weight " + weight);
            }

            for (Edge e : graph[u]) {
                int v = e.dest;
                int w = e.wt;

                if (!inMST[v] && w < minEdge[v]) {
                    minEdge[v] = w;
                    parent[v] = u; // Track the parent node
                    pq.add(new Pair(v, w));
                }
            }
        }

        // Print the total cost of the MST
        System.out.println("Total cost of MST: " + totalCost);
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int vertices = 6; // Renamed from 'v'
        ArrayList<Edge>[] graph = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<>();
        }
        createGraph(graph);
        prim(graph, vertices); // Renamed from 'v'
    }
}
