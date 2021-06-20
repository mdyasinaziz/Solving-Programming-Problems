import java.util.Scanner;
public class Task9 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        char [] c1 = s1.toCharArray();
        
        for (int i = 0 ; i < c1.length; i++) {
            c1[i] = (char) ((int)c1[i]-32);
        }
        for (int i = 0 ; i < c1.length; i++) {
            System.out.print(c1 [i]);
        }
    }
}
            
        