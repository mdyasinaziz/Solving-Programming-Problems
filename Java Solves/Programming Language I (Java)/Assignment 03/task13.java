import java.util.Scanner;
public class task13 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d, temp;
        System.out.println("Enter value of a: ");
        a = scanner.nextInt();
        System.out.println("Enter value of b: ");
        b = scanner.nextInt();
        System.out.println("Enter value of c: ");
        c = scanner.nextInt();
        System.out.println("Enter value of d: ");
        d = scanner.nextInt();
        
        temp = d;
        d = c;
        c = b;
        b = a;
        a = temp;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}