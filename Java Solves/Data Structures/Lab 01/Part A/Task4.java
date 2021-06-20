import java.util.Scanner;
public class Task4 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        int temp = 0;
        
        int [] a = new int [10];
        a [0] = sc.nextInt();
        for (int i = 1; i < a.length ; i++){
            int num = sc.nextInt();
            
            for (int j = 0; j <= i; j++){
                while (a [j] == num) {
                    System.out.println ("Error");
                    num = sc.nextInt();
                        j = 0;
                }              
            }
        a [i] = num;
    }
}
}