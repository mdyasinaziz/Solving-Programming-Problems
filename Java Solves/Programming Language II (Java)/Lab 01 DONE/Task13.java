import java.util.Scanner;
public class Task13{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int regera = x;
        int laferrari = x - 1;
        
        for (int n = 1 ; n <= regera ; n++) {
            System.out.print (n);
        }
        
        for (int n = laferrari; n >= 1 ; n--) {
             System.out.print (n);
        }
    }
}