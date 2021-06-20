import java.util.Scanner;
public class Task11 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number ");
        int x = sc.nextInt();
        allDigitsOdd (x);
    }
    
    public static void allDigitsOdd (int z){
        boolean result = true;
        for (int k = z; k != 0; k /= 10){
            int digit = k % 10;
            if (digit % 2 == 0) {
                result = false;
            }
        }
        System.out.println(result);
    }
}

/*while (z != 0) {
 int digit = z % 10;
 if (digit % 2 == 0) {
 result = false;
 }
 z /= 10;
 }*/