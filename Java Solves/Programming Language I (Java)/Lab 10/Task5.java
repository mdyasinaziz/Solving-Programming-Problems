import java.util.Scanner;

public class Task5{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int[] a = new int [10];
        for (int i = 0 ; i < a.length ; i++){
            System.out.println ("Please type a number");
            a[i] = sc.nextInt();
        }
        
        for (int i = 0 ; i < a.length ; ++i){
            if (a[i] % 2 == 0){
                System.out.println (a[i]);
                break;
            }
        }
    }
}