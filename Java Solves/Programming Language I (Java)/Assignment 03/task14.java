import java.util.Scanner;
public class task14 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number < 0)
            System.out.println(number * -1);
        else
            System.out.println(number);
    }
}