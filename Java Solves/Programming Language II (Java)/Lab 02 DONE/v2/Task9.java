import java.util.Scanner;
public class Task9{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int[] a = new int [10];
        for (int i = 0 ; i < a.length ; i++){
            System.out.println ("Please type a number");
            a[i] = sc.nextInt();
        } //^loop_for_taking_numbers
        
        for (int i = 0 ; i < a.length; i++){
            int max = a[i];
            int location = i;
            for (int j = i + 1; j < a.length; j++){
                if (a [j] < max){
                    max = a[j];
                    location = j;
                }
            }
            int temp = a[i];
            a [i] = max;
            a [location] = temp;
        } //^loopforsort
        
        System.out.println ("What Do You Want : 1.odd positions 2.even positions 3.all numbers");
        System.out.println ("Choose 1, 2 or 3");
        int n = sc.nextInt();
        
        if (n == 1){
            for (int i = 0 ; i < a.length ; i++){
                if ( a [i] % 2 != 0 ){
                    System.out.println (a[i]);
                }
            }
        }
        
        if (n == 2){
            for (int i = 0 ; i < a.length ; i++){
                if ( a [i] % 2 == 0 ){
                    System.out.println (a[i]);
                }
            }
        }
        
        if (n == 3){
            for (int i = 0 ; i < a.length ; i++){
                System.out.println (a[i] + " ");
            }
        }
        
        //proccess_of_user_interaction^
        
        System.out.println ("Your Numbers Are : ");
        for (int i = 0 ; i < a.length ; i++){
            System.out.print (a[i] + " ");
        } //loop_for_printing_All
    }
}