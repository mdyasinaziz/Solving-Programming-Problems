import java.util.Scanner;
public class Task4 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        String s1 = sc.nextLine();
        char [] c1 = s1.toCharArray();
        String s2 = sc.nextLine();
        char [] c2 = s2.toCharArray();
        int flag = 0;
        int c2lastindex = c2.length - 1 ;
        for (int i = c1.length - 1 ; i >= 0 ; i--) {
            if ( c1 [i] == c2 [c2lastindex] ) {
                flag++;
                c2lastindex--;
                if (flag == c2.length){
                    System.out.println ("true");
                break;
                }
            }
            
            else {
                System.out.println ("false");
                break;
            }
        }
    }
}
                
                