import java.util.Scanner;
public class Task5{
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int i = sc.nextInt ();
        int n = i-1;
        int k = 1;
        int m = 1;
        for (int a = 1; a <= i ; a++){ 
            for (int b = 1; b <= n ; b++){ 
                System.out.print(" ");
            }
            for (int b = m; b <= k ; b++){
                System.out.print(b);
            }
            System.out.println();
            n--;
            k++;
        }
    }
}
