import java.util.Scanner;
public class Task04 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Type Koren Length ");
        int len = sc.nextInt ();
        int [] arry = new int [len];
        
        for (int i = 0; i < arry.length; i++){
        System.out.println("enter number ");
            arry [i] = sc.nextInt();
        }
        
        for (int i = 0; i < arry.length; i++){
            if (arry [i] % 2 == 0){
            System.out.print(arry [i] + " ");
            }
        }
    }
}
        