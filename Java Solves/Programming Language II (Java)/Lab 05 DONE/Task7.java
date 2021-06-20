import java.util.Scanner;
public class Task7 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        String s1 = sc.nextLine();
        char [] c1 = s1.toCharArray();
        String s2 = sc.nextLine();
        char [] c2 = s2.toCharArray();
        String s3 = sc.nextLine();
        char [] c3 = s3.toCharArray();
        
        for (int i = c1.length - 1 ; i >= 0 ; i--) {
            if ( c1 [i] == c2 [0] ) {
                c1[i] = c3 [0];
                
            }
        }
        
        for (int i = 0; i < c1.length; i++){
            System.out.print (c1 [i]);
        }
    }
}
            
                