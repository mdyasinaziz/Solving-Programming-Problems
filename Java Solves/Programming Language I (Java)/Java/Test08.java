import java.util.Scanner;
public class Test08{
    public static void main (String [] args){
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Please Enter Your First Number");
        int n1 = keyboard.nextInt();
        System.out.println("Please Enter Your Second Number");
        int n2 = keyboard.nextInt();
        if (n1 > n2) {
            System.out.println( n1 - n2 );
        } else {
            System.out.println(n2 - n1);
        }
    }
}