import java.util.Scanner;
public class Task06{
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int a [] = new int [15];
        
        for (int i = 0 ; i < a.length ; i++){
            a [i] = sc.nextInt ();
        }
        for (int j = 0 ; j < 10 ; j ++) {
            int count = 0;
            for (int l = 0 ; l < a.length ; l ++){
                if ( a [j] == a [l] ) {
                    count++;
                }
            }
            System.out.println(j+ "is found "+ count+ " times");
        }   
    }
}