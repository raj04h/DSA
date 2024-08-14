package Questions;

import java.util.ArrayList;

public class cycle_detect {
    static class Edge {
        int dest;

        public Edge(int s, int d) {
            this.dest = d;
        }
    }

    static void creategraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }

    static boolean cycledirect(ArrayList<Edge> graph[], boolean vis[], int curr, boolean rec[]) {
        vis[curr] = true;
        rec[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (rec[e.dest]) { // cycle
                return true;
            } else if (!vis[e.dest]) {
                if (cycledirect(graph, vis, e.dest, rec)) {
                    return true;
                }
            }
        }
        rec[curr] = false;
        return false;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v = 4; // Adjusted to match the number of vertices with edges
        ArrayList<Edge> graph[] = new ArrayList[v];
        creategraph(graph);

        boolean vis[] = new boolean[v];
        boolean rec[] = new boolean[v];

        boolean hasCycle = false;
        
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                if (cycledirect(graph, vis, i, rec)) {
                    hasCycle = true;
                    break;
                }
            }
        }

        System.out.println("Graph has cycle: " + hasCycle);
    }
}
