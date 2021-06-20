package assign05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
/**
 *
 * @author Md. Yasin Aziz Abir 17201019 CSE221 Sec 5
 */

public class DijkstrasAlgorithm {
    // A Java program for Dijkstra's 
    // single source shortest path  
    // algorithm. The program is for 
    // adjacency matrix representation 
    // of the graph. 
  
    private static final int NO_PARENT = -1; 
  
    // Function that implements Dijkstra's 
    // single source shortest path 
    // algorithm for a graph represented  
    // using adjacency matrix 
    // representation 
    private static void dijkstra(int[][] adjacencyMatrix, int startVertex) {
        int nVertices = adjacencyMatrix[0].length; 
  
        // shortestDistances[i] will hold the 
        // shortest distance from src to i 
        int[] shortestDistances = new int[nVertices]; 
  
        // added[i] will true if vertex i is 
        // included / in shortest path tree 
        // or shortest distance from src to  
        // i is finalized 
        boolean[] added = new boolean[nVertices]; 
  
        // Initialize all distances as  
        // INFINITE and added[] as false 
        for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++){ 
            shortestDistances[vertexIndex] = Integer.MAX_VALUE; 
            added[vertexIndex] = false; 
        } 
          
        // Distance of source vertex from 
        // itself is always 0 
        shortestDistances[startVertex] = 0; 
  
        // Parent array to store shortest 
        // path tree 
        int[] parents = new int[nVertices]; 
  
        // The starting vertex does not  
        // have a parent 
        parents[startVertex] = NO_PARENT; 
  
        // Find shortest path for all  
        // vertices 
        for (int i = 1; i < nVertices; i++){
  
            // Pick the minimum distance vertex 
            // from the set of vertices not yet 
            // processed. nearestVertex is  
            // always equal to startNode in  
            // first iteration. 
            int nearestVertex = -1; 
            int shortestDistance = Integer.MAX_VALUE; 
            for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++){
                if (!added[vertexIndex] && shortestDistances[vertexIndex] < shortestDistance){ 
                    nearestVertex = vertexIndex; 
                    shortestDistance = shortestDistances[vertexIndex]; 
                }
            }
  
            // Mark the picked vertex as 
            // processed 
            added[nearestVertex] = true; 
  
            // Update dist value of the 
            // adjacent vertices of the 
            // picked vertex. 
            for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++){
                int edgeDistance = adjacencyMatrix[nearestVertex][vertexIndex]; 
                  
                if (edgeDistance > 0
                    && ((shortestDistance + edgeDistance) <  
                        shortestDistances[vertexIndex]))  
                { 
                    parents[vertexIndex] = nearestVertex; 
                    shortestDistances[vertexIndex] = shortestDistance +  
                                                       edgeDistance; 
                } 
            }
        }
  
        printSolution(startVertex, shortestDistances, parents); 
    }
  
    // A utility function to print  
    // the constructed distances 
    // array and shortest paths 
    private static void printSolution(int startVertex, int[] distances, int[] parents){
        System.out.println ("0 Is source Motijheel & 13 Is dest Moghbazar\n\n");
        int nVertices = distances.length; 
        System.out.print("Vertex\t      Distance\t              Path"); 
          
        for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++){
            if (vertexIndex != startVertex) { 
                System.out.print("\n" + startVertex + " -> "); 
                System.out.print(vertexIndex + " \t\t "); 
                System.out.print(distances[vertexIndex] + "\t\t"); 
                printPath(vertexIndex, parents); 
            }
        }
    }
  
    // Function to print shortest path 
    // from source to currentVertex 
    // using parents array 
    private static void printPath(int currentVertex, int[] parents) {
        // Base case : Source node has 
        // been processed 
        if (currentVertex == NO_PARENT){ 
            return; 
        }
        printPath(parents[currentVertex], parents); 
        
        if (currentVertex == 0) { System.out.print ("Motijheel" + " --> "); }
        else if (currentVertex == 13) { System.out.print ("Moghbazar" + ". :)    "); }
        else {
            char a = (char) (currentVertex+64);
            System.out.print(a + " -> ");
        }
    }
    
    
    
        // Main Method
	public static void main (String[] args){
            try {
            File file = new File("R:\\5th Semeseter CSE221\\A Lab Works\\Assignment 05\\src\\Assign05\\input.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String n = br.readLine();
            int node = Integer.parseInt(n);
            int graph[][] = new int[node][node];
            int i = 0; int j = 0;
            
            String st;
            while ((st = br.readLine()) != null) {
                String[] s = st.split(",");
                int a = Integer.parseInt(s[0]);
                graph [i][j] = a; j++;
                a = Integer.parseInt(s[j]);
                graph [i][j] = a; j++;
                a = Integer.parseInt(s[j]);
                graph [i][j] = a; j++;
                a = Integer.parseInt(s[j]);
                graph [i][j] = a; j++;
                a = Integer.parseInt(s[j]);
                graph [i][j] = a; j++;
                a = Integer.parseInt(s[j]);
                graph [i][j] = a; j++;
                a = Integer.parseInt(s[j]);
                graph [i][j] = a; j++;
                a = Integer.parseInt(s[j]);
                graph [i][j] = a; j++;
                a = Integer.parseInt(s[j]);
                graph [i][j] = a; j++;
                a = Integer.parseInt(s[j]);
                graph [i][j] = a; j++;
                a = Integer.parseInt(s[j]);
                graph [i][j] = a; j++;
                a = Integer.parseInt(s[j]);
                graph [i][j] = a; j++;
                a = Integer.parseInt(s[j]);
                graph [i][j] = a; j++;
                a = Integer.parseInt(s[j]);
                graph [i][j] = a; j++;
                
                i++; j=0;
            }
            
                DijkstrasAlgorithm t = new DijkstrasAlgorithm();
                t.dijkstra(graph, 0); 
            }
            catch (Exception e) {
            throw new IllegalArgumentException ("\nTry Again. :)\nNothing to Be sad! ");
            }
	}
}