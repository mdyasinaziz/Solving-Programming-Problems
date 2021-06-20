package quiz.pkg04.pkg10.feb;

import java.util.ArrayList;

public class DFSGraph {
    private int V;

    private ArrayList<Integer> adj[]; 
    boolean got = false;
  
    DFSGraph(int v){
        V = v; 
        adj = new ArrayList[v]; 
        for (int i=0; i<v; ++i){
            adj[i] = new ArrayList(); 
        }
    }
  
  
    void addEdge(int v, int w){ 
        adj[v].add(w);  
    }
  
   
    void DFSUtil(int v,boolean visited[]){
        
        visited[v] = true; 
        
        if (v == 9){
        System.out.print (v + "  --> ");
        got = true;
        }
        else if (got != true) {
            System.out.print(v + "  --> ");
            int j = 0;
            int size = adj[v].size();

            while (j < size) {
                int n = (int) adj[v].get(j);
                j++;
                if (!visited[n]) {
                    DFSUtil(n, visited);
                }
            }
        }
    }
        
  
   
    void DFS(int v){
        boolean visited[] = new boolean[V];  
        DFSUtil(v, visited); 
    }
}