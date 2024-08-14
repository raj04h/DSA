package Adjacency_List;

import java.util.ArrayList;

public class weigh_Undir{
    static class Edge{
        int src;//source
        int dest; //destination
        int wt; //weight

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();  // create an empty arraylist
        }
        graph[0].add(new Edge(0, 2,2));

        graph[1].add(new Edge(1, 2,10));
        graph[1].add(new Edge(1, 3,0));
        
        graph[2].add(new Edge(2, 0,2));
        graph[2].add(new Edge(2, 1,10));
        graph[2].add(new Edge(2, 3,-1));
        
        graph[3].add(new Edge(3, 1,0));
        graph[3].add(new Edge(3, 2,-1));
    }

    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v=4;

        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);

        //print 2's neighbour
        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.print(e.src+"->"+ e.dest+","+e.wt+" ");
        }
        System.out.println();
        for(int i=0;i<graph[1].size();i++){
            Edge e=graph[1].get(i);
            System.out.print(e.src+"->"+ e.dest+","+e.wt+" "); 
        }
    }

}