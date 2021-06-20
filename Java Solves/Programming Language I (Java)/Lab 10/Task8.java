import java.util.Scanner;

public class Task8{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int[] a = new int [10];
        for (int i = 0 ; i < a.length ; i++){
            System.out.println ("Please type a number");
            a[i] = sc.nextInt();
        }
        
        for (int j = a.length - 1 ; j >= 0 ; --j){
            if (a[j] % 2 == 0){
                System.out.println (a[j]);
            }
        }
    }
}