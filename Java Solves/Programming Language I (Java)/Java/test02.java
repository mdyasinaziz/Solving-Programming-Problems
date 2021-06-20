import java.util.Scanner;
public class test02{
    public static void main (String [] args)
    {
        Scanner keyboard;
        keyboard = new Scanner (System.in);
        System.out.println ("Pleae Type your number");
        float n1 = keyboard.nextFloat();
        System.out.println ("Please type your second number");
        float n2 = keyboard.nextFloat();
        float sum = (n1 + n2);
        float difference = (n1-n2);
        float product = (n1 * n2 );
        System.out.println ("Sum is " + sum);
        System.out.println ("Difference is " + difference);
        System.out.println ("Product is " + product);}
}