package Bridge_algo;

import java.util.ArrayList;

public class Articulation {
    static class Edge {
        int dest;

        public Edge(int s, int d) {
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[], int dt[], int low[], int time, int par, boolean[] ap) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (e.dest == par) {
                continue;
            }
            if (!vis[e.dest]) {
                children++;
                dfs(graph, e.dest, vis, dt, low, time, curr, ap);

                low[curr] = Math.min(low[curr], low[e.dest]);

                if (par != -1 && low[e.dest] >= dt[curr]) {
                    ap[curr] = true;
                }

                if (par == -1 && children > 1) {
                    ap[curr] = true;
                }
            } else {
                low[curr] = Math.min(low[curr], dt[e.dest]);
            }
        }
    }

    static void getArticulationPoints(ArrayList<Edge> graph[], int v) {
        int dt[] = new int[v];
        int low[] = new int[v];
        int time = 0;
        boolean vis[] = new boolean[v];
        boolean ap[] = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                dfs(graph, i, vis, dt, low, time, -1, ap);
            }
        }

        System.out.println("Articulation points in the graph:");
        for (int i = 0; i < v; i++) {
            if (ap[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        getArticulationPoints(graph, v);
    }
}
