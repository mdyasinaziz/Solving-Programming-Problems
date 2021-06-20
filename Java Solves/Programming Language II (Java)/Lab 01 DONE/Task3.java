import java.util.Scanner;
public class Task3{
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int i = sc.nextInt ();
        int n = 1;
        for (int a = 1; a <= i ; a++){ 
            for (int b = 1; b <= n ; b++){ 
            System.out.print(b);
        }
        System.out.println();
        n++;
        }
    }
}
            