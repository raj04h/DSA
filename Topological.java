package Graph_traversal;

import java.util.ArrayList;
import java.util.Stack;

public class Topological{

    static class Edge{
        int dest;

        public Edge(int s,int d){
            this.dest=d;
        }
    }

    static void createGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }

    static void topsortutil(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer> stack){
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);

            if(!vis[e.dest]){
                topsortutil(graph, e.dest, vis, stack);
            }
        }
        stack.push(curr);
    }

    static void topsort(ArrayList<Edge> graph[],int v){
        boolean vis[]=new boolean[v];
        Stack<Integer>stack=new Stack<>();

        for(int i=0;i<v;i++){
            if(!vis[i]){
                topsortutil(graph, i, vis, stack);
            }
        }
        while(! stack.empty()){
            System.out.print(stack.pop()+" ");
        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);

        topsort(graph, v);
    }
    
}