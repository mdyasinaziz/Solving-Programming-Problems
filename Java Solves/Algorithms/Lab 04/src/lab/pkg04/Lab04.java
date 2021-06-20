package lab.pkg04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author is going Thro Challenging Times
 */
public class Lab04 {

    public static void main(String[] args) throws Exception {
        try {
            File file = new File("R:\\5th Semeseter CSE221\\A Lab Works\\Lab 04\\src\\lab\\pkg04\\input.txt");
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
            throw new kisuParosNaException("!Kill Urself. :'(");
        }
    }
}
