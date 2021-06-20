package testingArrayList;
import java.util.ArrayList;

public class TestingClass {
    public static void main (String [] args){
    
        int nud = 6;
        ArrayList [] graph = new ArrayList [nud];
        for (int i = 0; i < graph.length; i++){
        graph [i] = new ArrayList ();
        }
        
        
        graph [0].add(1);
        graph [0].add(2);
        
        
        graph [2].add(3);
        graph [4].add(1);
        
        for (int i = 0; i < graph.length; i++){
        System.out.print (i + " --> ");
        for (int j = 0; j < graph [i].size (); j++){
        System.out.print (graph[i].get(j)+", ");
        }
        System.out.println();
        }
        
        
    }
}
