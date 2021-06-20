import java.util.Scanner;
public class Task12{
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Please enter your input ");
        int x = sc.nextInt();
        int line = x;
        int space = x - 1 ;
        int midspace = 1;
        int remain = 3;
        
        for (int n = 1; n<= line ; n++){
            for (int p = 1 ; p <= space ; p++) {
                System.out.print (" ");
            }
            if (n == 1) {
                System.out.print ("1");
            }
            else {
                System.out.print ("1");
                for (int i = 1; i <= midspace; i++) {
                    System.out.print(" ");
                }
                System.out.print (remain);
                midspace = midspace + 2;
            }
            System.out.println();
            remain = remain + 2;
            space--;
        }
        
        
        int secondspace = 1;
        midspace = midspace - 4;
        remain = remain - 4;
        
        for (int n = 1; n<= line-1 ; n++){
            for (int p = 1 ; p <= secondspace ; p++) {
                System.out.print (" ");
            }
            if (n == line - 1) {
                System.out.print ("1");
            }
            else {
                System.out.print ("1");
                for (int i = 1; i <= midspace; i++) {
                    System.out.print(" ");
                }
                System.out.print (remain);
                midspace = midspace - 2;
            }
            System.out.println();
            remain = remain - 2;
            secondspace++;
        }
    }
}
            
            
            
            
            
