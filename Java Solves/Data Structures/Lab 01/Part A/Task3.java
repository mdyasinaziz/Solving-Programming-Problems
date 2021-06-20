import java.util.Scanner;
public class Task3 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        int temp = 0;
        
        int [] a = new int [5];
        for (int i = 0; i < a.length ; i++){
            a [i] = sc.nextInt();
        }
        
        for (int i = 0; i < a.length; i++){
            int max = i;
            for (int j = i+1; j < a.length; j++){
                if (a [j] > a [max] ){
                max = j;
                }
                    
                temp = a [i];
                a [i] = a [max];
                a [j] = temp;
                
            }
        }
           
        
        for (int j = 0; j < a.length; j++) {
        System.out.println (a [j]);
        }
        
        for (int j = 0; j < a.length; j++) {
            if (a [j] % 2 == 0){     
            System.out.println (a [j]);
            }
            }
    }
}
        
        