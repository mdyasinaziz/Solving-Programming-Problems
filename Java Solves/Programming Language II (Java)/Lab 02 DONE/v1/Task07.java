import java.util.Scanner;
public class Task07{
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int a [] = new int [10];
        
        for (int i = 0 ; i < a.length ; i++){
            a [i] = sc.nextInt ();
        }
        for ( int j = 0 ; j < a.length ; j++ ) {
            System.out.println ( a [j] ) ;
        }
    }
}