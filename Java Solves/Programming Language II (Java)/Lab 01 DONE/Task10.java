import java.util.Scanner;
public class Task10{
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int i = sc.nextInt ();
        int lol = i - 1;
        int k = 1;
        int leg = i - 2;
        int n = i - 1 ;
        for (int a = 1; a <= i ; a++){ 
            for (int b = 1; b <= n ; b++){ 
                System.out.print(" ");
            }
            if ( a == 1) {
                System.out.print(i);
            }

        else if ( a == 2) {
            for (int p  = lol ; p <= lol+1 ; p++){
                System.out.print(p);
            }
        }
        else if ( a == i) {
            for (int p  = 1 ; p <= i ; p++){
                System.out.print(p);
            }
        }
        else { 
            System.out.print(leg);
            for ( int o = 1; o <= k ; o++) {
                System.out.print (" ");
            }
            System.out.print(i); 
            leg--;
            k++;
        }
        System.out.println( );
        n--;
    }
    }
}
            
            
            