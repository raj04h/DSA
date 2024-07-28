package Graph_traversal;

import java.util.ArrayList;

public class DFS {
    static class Edge{ 
        int dest; //destination

        public Edge(int s,int d){
            this.dest=d;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();  // create an empty arraylist
        }
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
    static void dfs(ArrayList<Edge>graph[],int curr,boolean vis[]){
        System.out.print(curr +"->");
        vis[curr]=true;
        
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.dest]==false){
            dfs(graph,e.dest,vis);
            }

         }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v=7;

        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);

        boolean vis[]=new boolean[v];
        for(int i=0;i<v;i++){
            if(vis[i]==false){
        dfs(graph, i,vis);
            }
        
    }
      
}   
}
