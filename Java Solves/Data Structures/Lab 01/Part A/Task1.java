import java.util.Scanner;
public class Task1 {
    
    public static boolean firstLast6 (int [] b){
        boolean t = false;
        if (b[0] == 6  || b [6 - 1] == 6 ){
            t = true;
            return t;
        }
        
        else {
        return t;
        }
    
    }  
    
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int [] a = new int [6];
        for (int i = 0; i < a.length ; i++){
            a [i] = sc.nextInt();
        }
        System.out.println (firstLast6(a));
        
    }
}