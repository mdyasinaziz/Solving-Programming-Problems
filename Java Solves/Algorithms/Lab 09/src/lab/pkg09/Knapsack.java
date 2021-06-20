package lab.pkg09;
/**
 *
 * @author 17201019 & 17201105
 */
import java.util.*;
class Knapsack
{

    // A utility function that returns maximum of two integers

     static int max(int a, int b) {

        return (a > b)? a : b; }

     // Returns the maximum value that can be put in a knapsack of capacity W
     static int knapSack(float W, float wt[], int val[], int n,int visited[])
     {
        // Base Case

    if (n == 0 || W == 0)
        return 0;

    // If weight of the nth item is more than Knapsack capacity W, then
    // this item cannot be included in the optimal solution
    if (wt[n-1] > W)
      {

        return knapSack(W, wt, val, n-1,visited);
      }
    // Return the maximum of two cases: 
    // (1) nth item included 
    // (2) not included
    else {

        int v1[]=new int[visited.length];
        System.arraycopy(visited, 0, v1, 0, v1.length);
        int v2[]=new int[visited.length];
        System.arraycopy(visited, 0, v2, 0, v2.length);
        v1[n-1]=1;

        int ans1 = val[n-1] + knapSack(W-wt[n-1], wt, val, n-1,v1);
        int ans2 = knapSack(W, wt, val, n-1,v2);
        if(ans1>ans2){
            System.arraycopy(v1, 0, visited, 0, v1.length);
            return ans1;
        }
        else{
            System.arraycopy(v2, 0, visited, 0, v2.length);
            return ans2;
        }
    }            
      }


    // Driver program to test above function
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        Scanner sc3 = new Scanner (System.in);
        Scanner sc4 = new Scanner (System.in);
        
        int testCase = sc.nextInt ();
        
        for (int i = 0; i < testCase; i++){
            
        String s1 = sc2.nextLine();
        String[] s2 = s1.split(" ");
        int p = Integer.parseInt(s2[0]);
        int q = Integer.parseInt(s2[1]);
        int r = Integer.parseInt(s2[2]);
        int val[] = new int[r];
        for (int k=0; k < val.length; k++) {val [k] = 1;}
        int Nafismax = p;
        int Arafatmax = q;
        
        String s3 = sc3.nextLine();
        s2 = s3.split(" ");
        p = Integer.parseInt(s2[0]);
        q = Integer.parseInt(s2[1]);
        r = Integer.parseInt(s2[2]);
        float wt[] = new float[]{p,q,r};
        
        
        int n = val.length;
        int visited[] = new int[n];
        
        int Arafat = (knapSack(Arafatmax, wt, val, n, visited));
        int Nafis = (knapSack(Nafismax, wt, val, n, visited));
        
        if (Arafat > Nafis) {System.out.println ("Arafat Wins!!!!");}
        if (Arafat == Nafis) {System.out.println ("Tie!!!!");}
        if (Arafat < Nafis) {System.out.println ("Nafis Wins!!!!");}
        }
    }
}