import java.util.Scanner;
public class Task7{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int[] a = new int [11];
        int dupli = 0;
        for (int i = 0 ; i < a.length; i++){
            System.out.println ("Please Enter a number");
            a[i] = sc.nextInt(); 
            for (int j = 0; j < i ; j++){
                if(a[i] == a[j]) {
                    dupli++;
                }
                if(dupli > 6) {
                    dupli--;
                    System.out.println ("Duplicate try again");
                    i--;
                    break;
                }
            }
        }  
        System.out.println ("Inputed number's were ");
        for (int i = 0 ; i < a.length ; i++){ 
            System.out.print (a [i] + " ");
        }
    }
}
