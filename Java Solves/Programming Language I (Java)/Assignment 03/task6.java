import java.util.Scanner;
public class task6 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print ("Please enter the value of S: ");
        double s = sc.nextDouble();
        double l;
        if (s < 100)
            l = (3000 - (125 * (s * s)));
        else 
            l = (12000 / 4 + ((s * s) * 14900));
        System.out.println (l);
    }
}