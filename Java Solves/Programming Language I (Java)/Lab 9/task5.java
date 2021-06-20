import java.util.Scanner;

public class task5{
    public static void main (String [] args){
        Scanner kb = new Scanner (System.in);
        int n;
        int num;
        for (n = 1 ; n <= 20; n = num + 1){
        System.out.println ("Please Type,,,,");
        num = kb.nextInt();
         if (num % 2 == 0){
                System.out.println ("num is even");
            }
            else {
                System.out.println ("num is odd");
            }
        }
}
}
      
        