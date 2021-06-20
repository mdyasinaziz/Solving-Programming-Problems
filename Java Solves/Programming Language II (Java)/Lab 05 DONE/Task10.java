import java.util.Scanner;
public class Task10 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        String s1 = sc.nextLine();
        char [] c1 = s1.toCharArray();
        String s2 = sc.nextLine();
        char [] c2 = s2.toCharArray();
        int b = 0;
        int o = 0;
        
        for (int i = 0; i < c1.length ; i++) {
            if (c1.length != c2.length) {
                break;
            }
            if ( c1 [i] == c2 [i] ) {
                b++;
            } 
        }
        
        if (b == c1.length){
            System.out.println ("TRUE");
        }
        else {
            System.out.println ("FALSE");
        }
    }
}

