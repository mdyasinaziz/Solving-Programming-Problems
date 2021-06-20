import java.util.Scanner;
public class Task2 {
    public static void main (String [] args){ 
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine(); 
        int n = sc.nextInt();
        char [] c = s.toCharArray();
        
        if ( n >= 0 && n < c.length ) {
        System.out.println ( c [n]);
    }
        else {
            System.out.println ("Invalid Index");
        }
}
}
            
    