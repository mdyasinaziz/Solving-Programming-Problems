import java.util.Scanner;
public class Task2{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int[] a = new int [10];
        for (int i = 0 ; i < a.length ; i++){
            a[i] = sc.nextInt();
            System.out.println ("You Have Entered " + a [i]);
        }
    }
}