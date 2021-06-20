import java.util.Scanner;
public class Task9{
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int i = sc.nextInt ();
        int k = 1;
        int leg = i - 2;
        for (int a = 1; a <= i ; a++){ 
            if ( a == 1) {
                System.out.print("1");
            }

        else if ( a == 2) {
            for (int p  = 1 ; p <= 2 ; p++){
                System.out.print(p);
            }
        }
        else if ( a == i) {
            for (int p  = 1 ; p <= i ; p++){
                System.out.print(p);
            }
        }
        else { 
            System.out.print("1");
            for ( int o = 1; o <= k ; o++) {
                System.out.print (" ");
            }
            System.out.print(leg); 
            leg++;
            k++;
        }
        System.out.println( );
    }
    }
}
            
            
            