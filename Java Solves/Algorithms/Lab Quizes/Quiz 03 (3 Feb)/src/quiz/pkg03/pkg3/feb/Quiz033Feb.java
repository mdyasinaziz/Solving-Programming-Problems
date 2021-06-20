package quiz.pkg03.pkg3.feb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author 17201019 & 17201105
 */
public class Quiz033Feb {
   public static void main(String[] args) {
        try {
            File file = new File("R:\\5th Semeseter CSE221\\A Lab Works\\Lab Quizes\\Quiz 03 (3 Feb)\\src\\quiz\\pkg03\\pkg3\\feb\\input.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String n = br.readLine();
            int node = Integer.parseInt(n);
            GraphUndirected g = new GraphUndirected(node); 
            String st;
            while ((st = br.readLine()) != null) {

                String[] s = st.split(",");
                int p = Integer.parseInt(s[0]);
                int q = Integer.parseInt(s[1]);
                g.addEdge(p, q); 
            }
  
  
//        g.BFS(3);
        for (int i = 0; i < node; i++) {
        g.BFS(i);
        }
        
        int [] finalArr = g.length;
        
        
        int min = finalArr[0];
        for (int ktr = 0; ktr < finalArr.length; ktr++) {
            if (finalArr[ktr] < min) {
                min = finalArr[ktr];
            }
        }
        
        for (int ktr = 0; ktr < finalArr.length; ktr++) {
            if (min == finalArr [ktr]) {
                System.out.println ("best one is total len " + finalArr [ktr] + " of " + ktr);
                break;
            }
        }
        
        for (int ktr = 0; ktr < finalArr.length; ktr++) {
            System.out.println ("Source is: " + ktr + ". Length is: " + finalArr [ktr]);
        }
        
        
        
       
        

    } catch (Exception e) {
            throw new IllegalArgumentException("Bhul");
        }
    }
}