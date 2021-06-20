import java.util.Scanner;
public class Task6 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the Length of the Array Please ");
        int pleasegivenumb = sc.nextInt();
        int [] a = new int [pleasegivenumb];
        int [] b = new int [pleasegivenumb];
        int counter = 0;
        int reverse = a.length - 1;
        
        for (int i = 0; i < a.length ; i++){
            System.out.println ("Enter number ");
            a [i] = sc.nextInt();
            b [i] = a [i];
        }
        
        for (int i = 0; i < a.length ; i++){ 
            a [i] = b [reverse];
            reverse--;
        }
        
        for (int i = 0; i < a.length; i++){
            if (a [i] == b [i]){
                counter++;
            }       
        }
        
        if (counter == a.length){
            System.out.println ("TRUE");
        }
        
        else {
            System.out.println ("FALSE");
        }
        
        /*for (int j = 0; j < a.length; j++) {
         System.out.println (a [j]);
         }
         for (int j = 0; j < b.length; j++) {
         System.out.println (b [j]);
         }*/
    }
}


