package lab.pkg01.cse221;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class runTask3ForDirected {
    
    
    public runTask3ForDirected () throws Exception {
    try {
            File file = new File("R:\\5th Semeseter CSE221\\A Lab Works\\Lab 01\\src\\lab\\pkg01\\cse221\\input.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String n = br.readLine();
            int node = Integer.parseInt(n);
        ArrayList[] graph = new ArrayList[node];
        int [] forInDegree = new int [node];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList();
        }
        
        
        
        String st;
        while ((st = br.readLine()) != null) {
            
            String[] s = st.split(" ");
            int p = Integer.parseInt(s[0]);
            int q = Integer.parseInt(s[1]);
            graph [p].add(q);
            forInDegree[q]++;
            }
        
        
        
        System.out.println ("Adjacency Matrix :- ");
        for (int i = 0; i < node; i++) {
        if (i == 0) { System.out.print ("  0 ");}
        else System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < graph.length; i++){
        System.out.print (i + " ");
        Collections.sort(graph[i]);
        int [] notunArray = new int [node];
        for (int j = 0; j < graph [i].size (); j++){
            int push = (int)graph[i].get(j);
            notunArray[push] = 1; 
        }
        for (int q = 0; q < notunArray.length; q++){
            System.out.print (notunArray [q] + " ");
        }
        System.out.println();
        }
        
        
        System.out.println(); System.out.println();
        System.out.println ("Adjacency List: - ");
        for (int i = 0; i < graph.length; i++){
        System.out.print (i + " --> ");
        for (int j = 0; j < graph [i].size (); j++){
        System.out.print (graph[i].get(j)+" ");
        }
        System.out.println();
        }
        
        
        System.out.println(); System.out.println();
        System.out.println ("Out/In degree: - ");
        for (int i = 0; i < graph.length; i++){
        System.out.print (i + " --> ");
        System.out.print (graph [i].size () + " / " +forInDegree [i]);
        System.out.println();
        }
        
        
        

            
        } catch (Exception e) {
            throw new Exception("Hoye Naiii");
        }
    }
    
    
}