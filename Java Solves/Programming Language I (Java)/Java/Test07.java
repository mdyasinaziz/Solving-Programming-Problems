import java.util.Scanner;
public class Test07{
    public static void main (String [] args){
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Please Enter Your First Number");
        int n1 = keyboard.nextInt();
        System.out.println("Please Enter Your Second Number");
        int n2 = keyboard.nextInt();
        if (n1 == n2) {
            System.out.println("The Number are Equal");
        } else if (n1 > n2) {
            System.out.println("First number is Greater");
        } else if ( n2 >  n1 ) {
            System.out.println("Second number is Greater");
        }
    }
}

    