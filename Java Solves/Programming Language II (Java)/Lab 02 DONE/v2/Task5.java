import java.util.Scanner;
public class Task5{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        double r = sc.nextDouble ();
        r = Math.pow(r,2);
        double pie = 3.1416;
        double f = sc.nextDouble ();
        double l = sc.nextDouble ();
        double c = sc.nextDouble ();
        double E = sc.nextDouble ();
        
        double denominator = Math.sqrt( r + Math.pow((2*pie*f*l - 1/2*pie*f*c),2));
        
        double I;
        I = E / denominator;
        System.out.printf ( "%.3f" , I) ;
    }
}