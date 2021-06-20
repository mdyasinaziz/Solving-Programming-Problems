package quiz.pkg01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Quiz01 {
    int g = 0;
    static boolean ab = false;
    static boolean ac = false;
    static boolean ad = false;
    static boolean bc = false;
    static boolean bd = false;
    static boolean cb = false;
    static boolean cd = false;
    public static void main (String [] args) {
    try {
            File file = new File("R:\\5th Semeseter CSE221\\A Lab Works\\Lab Quizes ATTENTION\\Quiz 01\\src\\quiz\\pkg01\\QuizParina.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String n1 = br.readLine();
            String n2 = br.readLine();        
            int node1 = Integer.parseInt(n1);
            int edge1 = Integer.parseInt(n2);
            
            ArrayList[] graph = new ArrayList[node1+1];
            for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList();
            }
        
        String st;
        while ((st = br.readLine()) != null) {
            if ("graph".equals(st)) {break;}
            String[] s = st.split(",");
            int p = Integer.parseInt(s[0]);
            int q = Integer.parseInt(s[1]);
            graph [p].add(q);
            graph [q].add(p);
            }
        
            
            String n3 = br.readLine();
            String n4 = br.readLine();
            int node2 = Integer.parseInt(n3);
            int edge2 = Integer.parseInt(n4);
            
            ArrayList[] graph2 = new ArrayList[node2+1];
            for (int i = 0; i < graph2.length; i++) {
            graph2[i] = new ArrayList();
            }
        
        
        while ((st = br.readLine()) != null) {
            if ("graph".equals(st)) {break;}
            
            String[] s = st.split(",");
            int p = Integer.parseInt(s[0]);
            int q = Integer.parseInt(s[1]);
            graph2 [p].add(q);
            graph2 [q].add(p);
            }
            
        
            String n5 = br.readLine();
            String n6 = br.readLine();
            int node3 = Integer.parseInt(n5);
            int edge3 = Integer.parseInt(n6);
            
            ArrayList[] graph3 = new ArrayList[node3+1];
            for (int i = 0; i < graph3.length; i++) {
            graph3[i] = new ArrayList();
            }
        
        
        while ((st = br.readLine()) != null) {
            if ("graph".equals(st)) {break;}
            
            String[] s = st.split(",");
            int p = Integer.parseInt(s[0]);
            int q = Integer.parseInt(s[1]);
            graph3 [p].add(q);
            graph3 [q].add(p);
            }
        
        
            String n7 = br.readLine();
            String n8 = br.readLine();
            int node4 = Integer.parseInt(n7);
            int edge4 = Integer.parseInt(n8);
            
            ArrayList[] graph4 = new ArrayList[node3+1];
            for (int i = 0; i < graph4.length; i++) {
            graph4[i] = new ArrayList();
            }
        
        
        while ((st = br.readLine()) != null) {
            String[] s = st.split(",");
            int p = Integer.parseInt(s[0]);
            int q = Integer.parseInt(s[1]);
            graph4 [p].add(q);
            graph4 [q].add(p);
            }   
        
        System.out.println ("Graphs Created");

        
        System.out.println ("C & D Graph");
        cd = true;
        if (node3 == node4 && edge3 == edge4) {
            for (int i = 0; i < graph3.length; i++){
                Collections.sort(graph3[i]);
                Collections.sort(graph4[i]);
                for (int j = 0; j < graph3 [i].size (); j++){
                if ((int)graph3 [i].get(j) == (int)graph4 [i].get(j)){
                cd = true;
                }
                else{
                    cd = false;
                    break; 
                }
                }
                if (cd == false) {break;}
            }
        }
        
        else { 
            cd = false;
        }
        
        if (cd == false) {System.out.println (cd);}
        if (cd == true) {System.out.println (cd);}
        
        
        
        
        System.out.println ("A & B Graph");
        ab = true;
        if (node1 == node2 && edge1 == edge2) {
            for (int i = 0; i < graph.length; i++){
                Collections.sort(graph3[i]);
                Collections.sort(graph4[i]);
                for (int j = 0; j < graph [i].size (); j++){
                if ((int)graph [i].get(j) == (int)graph2 [i].get(j)){
                ab = true;
                }
                else{
                    ab = false;
                    break; 
                }
                }
                if (ab == false) {break;}
            }
        }
        
        else { 
            ab = false;
        }
        
        if (ab == false) {System.out.println (ab);}
        if (ab == true) {System.out.println (ab);}
        
        
        
        
        System.out.println ("A & C Graph");
        ac = true;
        if (node1 == node3 && edge1 == edge3) {
            for (int i = 0; i < graph.length; i++){
                Collections.sort(graph[i]);
                Collections.sort(graph3[i]);
                for (int j = 0; j < graph [i].size (); j++){
                if ((int)graph [i].get(j) == (int)graph3 [i].get(j)){
                ac = true;
                }
                else{
                    ac = false;
                    break; 
                }
                }
                if (ac == false) {break;}
            }
        }
        
        else { 
            ac = false;
        }
        
        if (ac == false) {System.out.println (ac);}
        if (ac == true) {System.out.println (ac);}
        
        
        
        
        

        
        
        

            
        } catch (Exception e) {
            throw new IllegalArgumentException("Hoye Naiii");
        }
    }
    
    
}


/*            String st;
            while ((st = br.readLine()) != null) {
                                
                String[] s = st.split(",");
                int p = Integer.parseInt(s[0]);
                int q = Integer.parseInt(s[1]);
                arr[p][q] = 1;
                arr[q][p] = 1;
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
*/

    


//        System.out.println ("Adjacency Matrix :- ");
//        for (int i = 0; i < node1+1; i++) {
//        if (i == 0) { System.out.print ("  0 ");}
//        else System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < graph.length; i++){
//        System.out.print (i + " ");
//        Collections.sort(graph[i]);
//        int [] notunArray = new int [node1+1];
//        for (int j = 0; j < graph [i].size (); j++){
//            int push = (int)graph[i].get(j);
//            notunArray[push] = 1; 
//        }
//        for (int q = 0; q < notunArray.length; q++){
//            System.out.print (notunArray [q] + " ");
//        }
//        System.out.println();
//        }
//        
//        
//        System.out.println ("Adjacency Matrix2 :- ");
//        for (int i = 0; i < node2+1; i++) {
//        if (i == 0) { System.out.print ("  0 ");}
//        else System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < graph2.length; i++){
//        System.out.print (i + " ");
//        Collections.sort(graph2[i]);
//        int [] notunArray = new int [node2+1];
//        for (int j = 0; j < graph2 [i].size (); j++){
//            int push = (int)graph2[i].get(j);
//            notunArray[push] = 1; 
//        }
//        for (int q = 0; q < notunArray.length; q++){
//            System.out.print (notunArray [q] + " ");
//        }
//        System.out.println();
//        }




        
//        
//        System.out.println(); System.out.println();
//        System.out.println ("Adjacency List: - ");
//        for (int i = 0; i < graph.length; i++){
//        System.out.print (i + " --> ");
//        for (int j = 0; j < graph [i].size (); j++){
//        System.out.print (graph[i].get(j)+" ");
//        }
//        System.out.println();
//        }
//        
//        
//        System.out.println(); System.out.println();
//        System.out.println ("Out degree: - ");
//        for (int i = 0; i < graph.length; i++){
//        System.out.print (i + " --> ");
//        System.out.print (graph [i].size ());
//        System.out.println();
//        }