import java.util.Scanner;
public class task11 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, temp;
        System.out.println("Enter value of a: ");
        a = scanner.nextInt();
        System.out.println("Enter value of b: ");
        b = scanner.nextInt();
        System.out.println("Before Exchange: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        temp = a;
        a = b;
        b = temp;
        System.out.println("After exchange: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}