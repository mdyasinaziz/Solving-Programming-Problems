package lab.pkg08;
// A Java program for Floyd Warshall All Pairs Shortest 
// Path algorithm. 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
/**
 *
 * @author Who Am I eyh' ?
 */
public class AllPairShortestPath {
    final static int INF = 99999;
    int V = 0;

    public AllPairShortestPath(int ver) {
        V = ver;
    }
  
    public void floydWarshall(int graph[][]){ 
        int dist[][] = new int[V][V]; 
        int i, j, k; 
        
        /* Initialize the solution matrix same as input graph matrix. 
           Or we can say the initial values of shortest distances 
           are based on shortest paths considering no intermediate 
           vertex. */
        for (i = 0; i < V; i++) {
            for (j = 0; j < V; j++) {
                dist[i][j] = graph[i][j]; 
            }
        }
        /* Add all vertices one by one to the set of intermediate 
           vertices. 
          ---> Before start of an iteration, we have shortest 
               distances between all pairs of vertices such that 
               the shortest distances consider only the vertices in 
               set {0, 1, 2, .. k-1} as intermediate vertices. 
          ----> After the end of an iteration, vertex no. k is added 
                to the set of intermediate vertices and the set 
                becomes {0, 1, 2, .. k} */
        for (k = 0; k < V; k++){
            // Pick all vertices as source one by one 
            for (i = 0; i < V; i++){
                // Pick all vertices as destination for the 
                        // above picked source 
                    for (j = 0; j < V; j++) {
                    // If vertex k is on the shortest path from 
                        // i to j, then update the value of dist[i][j] 
                        if (dist[i][k] + dist[k][j] < dist[i][j]) {
                            dist[i][j] = dist[i][k] + dist[k][j];
                        }
                    }
                }
            }
        

        // Print the shortest distance matrix 
        printSolution(dist); 
    }
  
    public void printSolution(int dist[][]){ 
        System.out.println("The following matrix shows the shortest "+ 
                         "distances between every pair of vertices"); 
        System.out.println ("      A     B     C     D     E     F     G     H     I     J     K");
        char alphab = 'A'; int no = 64;
        for (int i=0; i<V; ++i){ 
            no++; 
            alphab = (char)(int)no;
            System.out.print (alphab+"    ");
            for (int j=0; j<V; ++j){ 
                if (dist[i][j]==INF) {
                    System.out.print("INF "); 
                }
                else {
                    if (dist[i][j] < 10) {System.out.print(" "+dist[i][j]+"    "); }
                    else {
                    System.out.print(dist[i][j]+"    "); 
                    }
                }
            }
            
            System.out.println(); 
        }
        System.out.println ("\nBepr na, Bepr nahh!");
    }
  
    // Driver program to test above function 
    public static void main (String[] args) { 
        try {
            File file = new File("R:\\5th Semeseter CSE221\\A Lab Works\\Lab 08\\src\\lab\\pkg08\\input.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String n = br.readLine();
            String[] ffff = n.split(" ");
            int node = Integer.parseInt(ffff[0]);
            AllPairShortestPath floyd = new AllPairShortestPath(node); 
            
            
            int gph[][] = new int[node][node];
            int i = 0; int j = 0;
            
            String st;
            while ((st = br.readLine()) != null) {
                String[] s = st.split(" ");
                int a = Integer.parseInt(s[j]);
                if (a==0) {a = 99999;}
                gph [i][j] = a; j++;
                a = Integer.parseInt(s[j]);
                if (a==0) {a = 99999;}
                gph [i][j] = a; j++;
                a = Integer.parseInt(s[j]);
                if (a==0) {a = 99999;}
                gph [i][j] = a; j++;
                a = Integer.parseInt(s[j]);
                if (a==0) {a = 99999;}
                gph [i][j] = a; j++;
                a = Integer.parseInt(s[j]);
                if (a==0) {a = 99999;}
                gph [i][j] = a; j++;
                a = Integer.parseInt(s[j]);
                if (a==0) {a = 99999;}
                gph [i][j] = a; j++;
                a = Integer.parseInt(s[j]);
                if (a==0) {a = 99999;}
                gph [i][j] = a; j++;
                a = Integer.parseInt(s[j]);
                if (a==0) {a = 99999;}
                gph [i][j] = a; j++;
                a = Integer.parseInt(s[j]);
                if (a==0) {a = 99999;}
                gph [i][j] = a; j++;
                a = Integer.parseInt(s[j]);
                if (a==0) {a = 99999;}
                gph [i][j] = a; j++;
                a = Integer.parseInt(s[j]);
                if (a==0) {a = 99999;}
                gph [i][j] = a; j++;
                
                i++; j=0;
            }
            
            // Print the solution 
            floyd.floydWarshall(gph);
            
        } catch (Exception e) {
            throw new IllegalArgumentException("\nTry Again. :)\nYou're Chained to a soul! ");
        }
    }
}