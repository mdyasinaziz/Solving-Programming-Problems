import java.util.Scanner;
public class Abir4{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int[] a = new int [3];
        for (int i = 0 ; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0 ; i < a.length ; i++){
            int max = i;
            for ( int j = max + 1; j < a.length; j++){
                if (a [j] > a [i]){
                    max = j;
                }
            }
        
        int temp = a[i];
        a [i] = a [max];
        a [max] = temp;
        System.out.println (a[i]);
    }
        
}
}
                
 