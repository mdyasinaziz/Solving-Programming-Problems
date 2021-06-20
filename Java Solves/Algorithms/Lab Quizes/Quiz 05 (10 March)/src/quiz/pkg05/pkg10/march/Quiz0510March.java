package quiz.pkg05.pkg10.march;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
/**
 *
 * @author 17201019
 */
public class Quiz0510March {
    // Main Method
	public static void main (String[] args){
            try {
            File file = new File("R:\\5th Semeseter CSE221\\A Lab Works\\Lab Quizes\\Quiz 05 (10 March)\\src\\quiz\\pkg05\\pkg10\\march\\input.txt");
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
                
                
                i++; j=0;
            }
            
                DijkstrasAlgorithm t = new DijkstrasAlgorithm();
                for (int k = 0; k<9; k++) {
                t.dijkstra(graph, k); 
                }
            }
            catch (Exception e) {
            throw new IllegalArgumentException ("\nTry Again. :)\nNothing to Be sad! ");
            }
	}
}
