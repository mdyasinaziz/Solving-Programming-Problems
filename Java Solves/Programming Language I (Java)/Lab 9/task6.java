import java.util.Scanner;

public class task6{
    public static void main (String [] args){
        Scanner kb = new Scanner (System.in);
        int n = kb.nextInt();
        
        for (int i = 1; i <= n ; i = i +1){
            System.out.println (" Please type a number ");
            int num = kb.nextInt ();
            if ( num % 2 == 0 ){
                System.out.println ("num is even");
            } else {
                System.out.println ("num is odd");
            }
        }
    }
}
        