import java.util.Scanner;
public class task10 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your favourite car name: ");
        String carname = scanner.next();
        for (int i=1 ; i <= 4 ; i++) {
            System.out.println (carname);
        }
    }
}