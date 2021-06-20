import java.util.Scanner;
public class Task7{
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int i = sc.nextInt ();
        int n = i-1;
        int m = 1;
        int legend = (i*2) - 1;
        int leg = (i - i) + 1; 
        for (int a = 1; a <= i ; a++){ 
            for (int b = 1; b <= n ; b++){ 
                System.out.print(" ");
            }
            for (int c = 1; c <= m; c++){
                System.out.print(c);
            }
            System.out.println();
            m = m +2;
            n--;
        }
        legend = legend - 2;
        for (int a = 1; a <= i-1 ; a++){ 
            for (int b = 1; b <= leg; b++){ 
                System.out.print(" ");
            }
            for (int c = 1; c <= legend; c++){
                System.out.print(c);
            }
            n--;
            leg++;
            legend = legend - 2;
            System.out.println();
    }
}
}