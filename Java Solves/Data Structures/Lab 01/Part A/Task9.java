import java.util.Scanner;
public class Task9 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int [] arr = new int [10];
        for (int i = 0; i < arr.length; i++){
            System.out.print ("Give Input :) ");
            arr [i] = sc.nextInt();
        }
        printNumbers (arr);
        printSquaredNumbers (arr);
    }
    
    public static void printNumbers (int [] x) {
        for (int i = 0; i < x.length; i++){
            System.out.print (x [i] + " ");
        }
    }
    
    public static void printSquaredNumbers (int [] x) {
        for (int i = 0; i < x.length; i++){
            x [i] = x [i] * x [i];
            System.out.print (x [i] + " ");
        }
    }
}