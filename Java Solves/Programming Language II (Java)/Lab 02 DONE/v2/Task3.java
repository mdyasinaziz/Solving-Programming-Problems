import java.util.Scanner;
public class Task3{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int[] a = new int [10];
        for (int i = 0 ; i < a.length ; i++){
            System.out.println ("Please type a number");
            a[i] = sc.nextInt();
        }  
        for (int i = 0 ; i < a.length; i++){
            int max = a[i];
            int location = i;
            for (int j = i + 1; j < a.length; j++){
                if (a [j] > max){
                    max = a[j];
                    location = j;
                }
            }
            int temp = a[i];
            a [i] = max;
            a [location] = temp;
        }
        for (int i = 0 ; i < a.length ; i++){
            System.out.println (a[i]);
        }
        
    }
}

