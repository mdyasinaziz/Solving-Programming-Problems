import java.util.Scanner;
public class Task7 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int [] arr = new int [10];
        for (int i = 0; i < arr.length ; i++){
            arr [i] = sc.nextInt();
        }
        System.out.println("Please input a number for the * cell ");
        int x = sc.nextInt();
        
        int cell = arr [x];
        //System.out.println(cell);
        for (int i = 0; i < cell ; i++){
        System.out.print("*");
        }
        
    }
}
        
        