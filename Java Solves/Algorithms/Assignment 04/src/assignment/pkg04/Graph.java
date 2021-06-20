package assignment.pkg04;
import java.util.ArrayList;
/**
 *
 * @author 17201019
 */

public class Graph {
    private int V;   // No. of vertices 
  
    // Array  of lists for Adjacency List Representation 
    private ArrayList<Integer> adj[]; 
    public int [] color;
    public static int time = 0;
    public int [] dis;
    public int [] finish;
    public int [] parent;
    // Constructor 
    Graph(int v){
        V = v; 
        adj = new ArrayList[v]; 
        for (int i=0; i<v; ++i){
            adj[i] = new ArrayList(); 
        }
        color = new int [V];
        dis = new int [V];
        finish = new int [V];
        parent = new int [V];
    }
  
    //Function to add an edge into the graph 
    void addEdge(int v, int w){ 
        adj[v].add(w);  // Add w to v's -- ;) list. 
    }
  
    // A function used by DFS 
    void DFSUtil(int v,boolean visited[]){
        // Mark the current node as visited and print it 
        visited[v] = true; 
        // Recur for all the vertices adjacent to this vertex 
        
        int j = 0; int size = adj[v].size();
        
        while (j < size) {
            int n = (int) adj[v].get(j);
            j++;
            if (!visited[n]) {
                color[n] = 1; 
                System.out.println(n + " Has Been Found (Making Grey) (" + color[n] + ")");
                time++;
                dis [v] = time;
                parent [n] = v; 
                DFSUtil(n, visited);
            }
        }
        time++;
        color[v] = 2;
        System.out.println(v + " Has Been Processed (Making Black) (" + color[v] + ")");
        finish [v] = time + 1;
    }
  
    // The function to do DFS traversal. It uses recursive DFSUtil() 
    void DFS(int v){
        // Mark all the vertices as not visited(set as 
        // false by default in java) 
        boolean visited[] = new boolean[V]; 
        
        color[v] = 1;
        System.out.println(v + " Has Been Found (Making Grey) (" + color[v] + ")");

        // Call the recursive helper function to print DFS traversal 
        DFSUtil(v, visited); 
        System.out.println ();
        
        
        for (int i = 0; i < parent.length;i++) {
        System.out.println (i + " 's parent is " + parent [i]);
        }
        
        for (int i = 0; i < finish.length;i++) {
        System.out.println ("Took " + i + "to finish in " + finish [i] + "steps.");
        }
    }
}
