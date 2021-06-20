import java.util.Scanner;
public class Task2 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int maxIndex = 0;
        int minIndex = 0;
        int temp1 = 0;
        int temp2 = 0;
        int [] a = new int [5];
        for (int i = 0; i < a.length ; i++){
            a [i] = sc.nextInt();
        }
        
        for (int i = 0; i < a.length; i++){
            if (a [i] < a [minIndex]){
                minIndex = i;
            }
            if (a [i] > a [maxIndex]){
                maxIndex = i;
            }
        }
        
        temp1 = a [minIndex];
        temp2 = a [maxIndex];
        
        a [minIndex] = temp2;
        a [maxIndex] = temp1;
        
        
        for (int i = 0; i < a.length ; i++){
            System.out.println(a [i]);
        }
        
    }
}
