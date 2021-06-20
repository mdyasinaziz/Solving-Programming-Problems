import java.util.Scanner;
public class Task3 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        String s1 = sc.nextLine();
        char [] c1 = s1.toCharArray();
        String s2 = sc.nextLine();
        char [] c2 = s2.toCharArray();
        int flag = 0;
        for (int i = 0; i < c1.length ; i++) {
            if ( c1 [i] == c2 [i] ) {
                flag++;
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
                
                