import java.util.Scanner;
public class test{
    public static void main (String [] args)
    {
        Scanner keyboard;
        keyboard = new Scanner (System.in);
        System.out.println ("Please type your 1st number");
        Double n1 = keyboard.nextDouble();
        System.out.println ("Please type your 2nd number");
        Double n2 = keyboard.nextDouble();
        Double sum = n1 + n2;
        Double difference = n1 - n2;
        Double product = n1 * n2;
        System.out.println (sum);
        System.out.println (difference);
        System.out.println (product);}
}
           
                                
