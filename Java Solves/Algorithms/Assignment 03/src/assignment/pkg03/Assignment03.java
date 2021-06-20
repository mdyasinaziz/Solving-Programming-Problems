package assignment.pkg03;
import java.util.Scanner;
/**
 *
 * @author Md. Yasin Aziz 17201019 CSE221 Sec5
 */
public class Assignment03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Press 1 for Directed. Press 2 for Undirected: ");
        int i = sc.nextInt();
        if (i == 1) {
        GraphDirected g = new GraphDirected(4); 
  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 1); 
  
        System.out.println ("For Directed Graph: -----------");
        System.out.println("BFS (starting from vertex 2)"); 
  
        g.BFS(2);
        }
        
        else if (i == 2) {
        GraphUndirected g = new GraphUndirected(4); 
  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 1); 
  
        System.out.println ("For UnDirected Graph: -----------");
        System.out.println("BFS (starting from vertex 2)"); 
  
        g.BFS(2);
        }
        else {
        System.out.println ("Input Error");
        }
    }
    
}
