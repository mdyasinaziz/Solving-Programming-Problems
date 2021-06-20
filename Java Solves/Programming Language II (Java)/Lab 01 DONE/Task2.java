import java.util.Scanner;
public class Task2{
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int i = sc.nextInt ();
        int j = sc.nextInt ();
        
        for (int a = 1; a <= i ; a++){
            for (int b = 1; b <= j ; b++){
                System.out.print (b);
            }
            System.out.println ();
        }
    }
}
    
    
    