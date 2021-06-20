import java.util.Scanner;
public class Task8 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The size of the matrix ");
        int n = sc.nextInt();
        int [] arr1 = new int [n];
        int [] arr2 = new int [n];
        int [] C = new int [n];
        
        for (int i = 0; i < arr1.length ; i++){
            System.out.println("For Array 1 input ");
            arr1 [i] = sc.nextInt();
        }
        
        for (int i = 0; i < arr2.length ; i++){
            System.out.println("For Array 2 input ");
            arr2 [i] = sc.nextInt();
        }
        
        for (int i = 0; i < arr1.length ; i++){
            C [i] = 5 * arr1 [i] - arr2 [i];
        }
        
        for (int i = 0; i < arr1.length ; i++){
            System.out.print(C [i] + " ");
        }
    }
}