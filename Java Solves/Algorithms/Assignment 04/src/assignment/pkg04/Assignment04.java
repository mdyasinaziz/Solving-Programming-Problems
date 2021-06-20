package assignment.pkg04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
/**
 *
 * @author 17201019
 */
public class Assignment04 {

    public static void main(String[] args) throws Exception {
        try {
            File file = new File("R:\\5th Semeseter CSE221\\A Lab Works\\Assignment 04\\src\\assignment\\pkg04\\input.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String n = br.readLine();
            int node = Integer.parseInt(n);
            Graph g = new Graph(node);
            String st;
            while ((st = br.readLine()) != null) {

                String[] s = st.split(",");
                int p = Integer.parseInt(s[0]);
                int q = Integer.parseInt(s[1]);
                g.addEdge(p, q);
            }
            
            System.out.println ("Printing Graph on DFS. From Source: ");
            g.DFS(0); 
            
            
        } catch (Exception e) {
            throw new IllegalArgumentException("!Kill Urself. :'(");
        }
    }
}
