import java.util.Scanner;
public class Task04{
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int a [] = new int [20];
        for (int i = 0 ; i < a.length ; i++){
            a [i] = sc.nextInt ();
        }
        for ( int j = a.length-1 ; j >= 0 ; j--) {
            if ( a [j] % 2 == 0) {
            System.out.println ( a [j] );
        }
    }
}
}
            