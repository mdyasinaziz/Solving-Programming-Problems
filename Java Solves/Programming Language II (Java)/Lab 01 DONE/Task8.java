import java.util.Scanner;
public class Task8{
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int i = sc.nextInt ();
        int j = sc.nextInt ();
        int k = j -2;
        for (int a = 1; a <= i ; a++){ 
            if ( a == 1) {
                for (int c  = 1 ; c <= j ; c++){
                    System.out.print(c);
                }
            }
            else if ( a == i) {
                for (int p  = 1 ; p <= j ; p++){
                    System.out.print(p);
                }
            }
            else { 
                System.out.print ("1"); 
                for ( int w = 1 ; w <= k ; w++){
                    System.out.print (" ");
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
                
                