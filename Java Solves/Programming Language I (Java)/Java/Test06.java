import java.util.Scanner;
public class Test06{
    public static void main (String [] args){
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Please Enter Your First Number");
        int n1 = keyboard.nextInt();
        System.out.println("Please Enter Your Second Number");
        int n2 = keyboard.nextInt();
        if (n1 > n2) {System.out.println("First is greater");}
        else {System.out.println("First Is Not Greater");}
        }
    }