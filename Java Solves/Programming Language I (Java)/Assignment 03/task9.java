import java.util.Scanner;
public class task9 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int n, largest;
        n = scanner.nextInt();
        largest = n;
        System.out.println("Enter second number");
        n = scanner.nextInt();
        if(n> largest) largest = n;
        System.out.println("Enter third number");
        n = scanner.nextInt();
        if(n > largest) largest = n;
        
        System.out.println("Largest number: " + largest);
    }
}