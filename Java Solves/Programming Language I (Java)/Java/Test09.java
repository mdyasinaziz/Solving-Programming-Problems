import java.util.Scanner;
public class Test09{
    public static void main (String [] args){
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Please Enter Your Number");
        int n1 = keyboard.nextInt();
        if (n1 % 2 == 0) {
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
}
        