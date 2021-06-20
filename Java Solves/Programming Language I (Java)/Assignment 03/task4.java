import java.util.Scanner;
public class task4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter your payment: ");
        int payment = scanner.nextInt();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        float rate;
        if(age < 18 || payment < 10000)
            rate = 0;
        else if(payment < 20000)
            rate = 0.05f;
        else
            rate = 0.1f;
            
            
            System.out.println("Your tax is: " + (payment * rate));
    }
}