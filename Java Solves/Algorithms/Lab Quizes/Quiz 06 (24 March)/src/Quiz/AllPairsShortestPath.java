package Quiz;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class AllPairsShortestPath {
    final static int INF = 99999;
    int V = 0;
    int datas [];
    public AllPairsShortestPath(int ver) {
        V = ver;
        datas = new int [ver];
    }
  
    public void floydWarshall(int graph[][]){
        int dist[][] = new int[V][V]; 
        int i, j, k; 
        for (i = 0; i < V; i++) {
            for (j = 0; j < V; j++) {
                dist[i][j] = graph[i][j]; 
            }
        }
        for (k = 0; k < V; k++){

            for (i = 0; i < V; i++){

                    for (j = 0; j < V; j++) {

                        if (dist[i][k] + dist[k][j] < dist[i][j]) {
                            dist[i][j] = dist[i][k] + dist[k][j];
                        }
                    }
                }
            }
        
        int sum = 0; int p = 0; int leng = dist [0].length;
        for (int d = 0; d < leng;d++) {
            for (int s = 0; s < leng; s++) {
            sum = sum + dist [d][s];
            }
            datas [d] = sum;
            sum = 0;
        }
        
        for (int g : datas) {
        System.out.println (g);
        }
        int maxValue = datas[0]; int maxidx = 0;
        for (int f = 1; f < datas.length; f++) {
            if (datas[f] > maxValue) {
                maxValue = datas[f];
                maxidx = f;
            }
        }
        System.out.println ("Highest Value is " + maxValue + "in source " +maxidx+ "\n\n");

    }
    
 
  
    // Driver program to test above function 
    public static void main (String[] args) { 
        try {
            File file = new File("E:\\input.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String n = br.readLine();
            String[] ffff = n.split(" ");
            int node = Integer.parseInt(ffff[0]);
            AllPairsShortestPath floyd = new AllPairsShortestPath(node); 
            
            
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
            throw new IllegalArgumentException("\n Error !");
        }
    }
}