import java.util.Scanner;

public class task8{
    public static void main (String [] args){
        Scanner kb = new Scanner (System.in);
        int number = kb.nextInt();
        int divisorcount = 0;
        for (int i =1 ; i <= number; i++){
            if (number % i == 0){
                System.out.println (i);
                divisorcount++;
            }
        }
        System.out.println ("Total Divisor " + divisorcount);
    }
}