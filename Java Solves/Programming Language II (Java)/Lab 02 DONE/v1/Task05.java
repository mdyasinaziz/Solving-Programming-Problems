import java.util.Scanner;
public class Task05{
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int a [] = new int [10];
        int x = 0;
        for (int i = 0 ; i < a.length ; i++){
            a [i] = sc.nextInt ();
        }
        int k = sc.nextInt();
        
        for ( int j = 0 ; j < a.length ; j++) {
            if ( a [j] == k ){
                x = 1;
        }
    }
        if ( x == 0 ){
            System.out.println ( " NO " ) ;
}
        else {
            System.out.println ( " YEP " ) ;
}
}
}