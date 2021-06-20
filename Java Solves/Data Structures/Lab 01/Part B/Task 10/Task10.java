import java.util.Scanner;
public class Task10 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter Length of the Array ");
        int len = sc.nextInt();
        int [] arr = new int [len];
        for (int i = 0; i < arr.length; i++) {
        System.out.println ("Enter number for array ");
        arr [i] = sc.nextInt();
        }
        
        System.out.println ("Enter the no to start rotation from ");
        int size = sc.nextInt();
        System.out.println ("Input 1 for leftRotation | 2 for rightRotation ");
        int direction = sc.nextInt();
        int left = 0;
        int right = 0;
        if (direction == 1){
        left++;
        }
        else if (direction == 2){
        right++;
        }
        else{
        System.out.println ("Wrong Input ");
        }
        
        int innerCounter = size;
        if (left == 1) {
            for (int i = 0; i < arr.length ;i++){
            if (innerCounter == arr.length){
            innerCounter = 0;
            }
            System.out.println (arr [innerCounter]);
            innerCounter++;
            }
        }
        
        int innerCounter2 = (arr.length - size);
        if (right == 1) {
            for (int i = 0; i < arr.length ;i++){
            if (innerCounter2 == arr.length){
            innerCounter2 = 0;
            }
            System.out.println (arr [innerCounter2]);
            innerCounter2++;
            }
        }
    }
}