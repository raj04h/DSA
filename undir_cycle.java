package Questions;

import java.util.ArrayList;

public class undir_cycle {
    
    static class Edge{
        int dest;

        public Edge(int s,int d){
            this.dest=d;
        }
    }

    static void creategraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));
    }

    static boolean iscycleUndirected(ArrayList<Edge> graph[],boolean vis[],int curr,int par){
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);//neighbour
            if(vis[e.dest] && e.dest!=par){ //to check neighbour is visited and not parrent
                return true;
            }
            else if(!vis[e.dest]){
                if(iscycleUndirected(graph, vis, e.dest, curr)){
                    return true;
                }
            }
        }
        return false;
    }


    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v=6;

        ArrayList<Edge> graph[]=new ArrayList[v];
        creategraph(graph);

        System.out.println(iscycleUndirected(graph, new boolean[v], 0, -1));
    }

}
