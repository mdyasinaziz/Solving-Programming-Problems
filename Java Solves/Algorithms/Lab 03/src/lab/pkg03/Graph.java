package lab.pkg03;
/**
 *
 * @author Not Yours.
 */
import java.util.*;

class Graph {
    private int V; //no of vertices
    private ArrayList adj[]; 
    public int [] color;
    public int [] predec; int ite = 0;
    public int [] dis;
    Graph(int v) {
        V = v;
        adj = new ArrayList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new ArrayList();
        }
        color = new int [V];
        predec = new int [V];
        dis = new int [V];
    }
    
    void addEdge(int v, int w) {
        adj[v].add(w);
    }
    
    void BFS(int s) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            predec [ite] = s; ite++;
            System.out.println("BFS Printing: " + s + " ");

            int j = 0; int size = adj[s].size();
            
            if (color[s] == 0) {
                color[s] = 1;
                System.out.println(s + " Has Been Found (Making Grey) (" + color[s] + ")");
            }
            
            
            while (j < size) {
                int n = (int)adj[s].get(j);
                j++;
                if (!visited[n]) {
                    dis [n] = dis[s] +1;
                    visited[n] = true;
                    queue.add(n);
                }
            }
            
            if (color[s] == 1){
            color[s] = 2;
            System.out.println (s + " Is Finished Processing (Making Black) (" + color[s] + ")");
            }
        }
        
        for (int i = 2; i <= predec.length; i++) {
            System.out.println (predec [i-1] + " 's parent is " + predec [(i/2)-1]);
        }
        
        System.out.println ();
        for (int i = 0; i < dis.length; i++) {
            System.out.println (i + " Vertex's " + "Distance is " + dis [i]);
        }
        
    
}
}










///* Extensive commented version
//package GraphTraversalBFS;
//
//
//// Java program to print BFS traversal from a given source vertex. 
//// BFS(int s) traverses vertices reachable from s. 
//
//
//// This class represents a directed graph using adjacency list 
//// representation 
//class Graph {
//
//    private int V;   // No. of vertices 
//    private /*LinkedList<Integer>*/ ArrayList adj[]; //Adjacency Lists 
//
//    // Constructor 
//    Graph(int v) {
//        V = v;
//        adj = new ArrayList[v];
//        for (int i = 0; i < v; ++i) {
//            adj[i] = new ArrayList();
//        }
//        int [] color = new int [V];
//    }
//
//    // Function to add an edge into the graph 
//    void addEdge(int v, int w) {
//        adj[v].add(w);
//    }
//
//    // prints BFS traversal from a given source s 
//    void BFS(int s) {
//        // Mark all the vertices as not visited(By default 
//        // set as false) 
//        boolean visited[] = new boolean[V];
//
//        // Create a queue for BFS 
//        LinkedList<Integer> queue = new LinkedList<Integer>();
//
//        // Mark the current node as visited and enqueue it 
//        visited[s] = true;
//        queue.add(s);
//
//        while (queue.size() != 0) {
//            // Dequeue a vertex from queue and print it 
//            s = queue.poll();
//            System.out.print(s + " ");
//
//            // Get all adjacent vertices of the dequeued vertex s 
//            // If a adjacent has not been visited, then mark it 
//            // visited and enqueue it 
//            int j = 0; int size = adj[s].size();
//            
//            while (j < size) {
//                int n = (int)adj[s].get(j);
//                j++;
//                if (!visited[n]) {
//                    visited[n] = true;
//                    queue.add(n);
//                }
//            }
//        }
//    }
//}
//
//*/