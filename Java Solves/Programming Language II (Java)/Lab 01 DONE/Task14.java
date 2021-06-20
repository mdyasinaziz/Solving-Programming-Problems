import java.util.Scanner;
public class Task14{
    public static void main (String [] args){
        int p, q, r;
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter Input");
        
        r = sc.nextInt();
        
        for (p = 1; p <= r; p++) {
            for (q = p; q < r; q++)
                System.out.print(" ");
            
            for (q = 1; q <= p; q++)
                System.out.print(q);
            
            for (q = p - 1; q >= 1; q--)
                System.out.print(q);
            System.out.println();
        }        
    }
}