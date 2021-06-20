import java.util.Scanner;
public class task12 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, temp;
        System.out.println("Enter value of a: ");
        a = scanner.nextInt();
        System.out.println("Enter value of b: ");
        b = scanner.nextInt();
        System.out.println("Enter value of c: ");
        c = scanner.nextInt();
        System.out.println("Before exchange:\na = "+ a + "\nb = " + b + "\nc = " + c);
        temp = b;
        b = c;
        c = a;
        a = temp;
        System.out.println("After exchange:\na = " + a + "\nb = " + b + "\nc = " + c);
    }
}