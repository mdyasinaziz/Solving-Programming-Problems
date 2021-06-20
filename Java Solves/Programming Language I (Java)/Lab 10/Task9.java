import java.util.Scanner;

public class Task9{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int[] a = new int [10];
        for (int i = 0 ; i < a.length ; i++){
            System.out.println("Please type a number");
            a[i] = sc.nextInt();
        }
        
        boolean gotit = false;
        System.out.println("Please type the number to check if duplicate or not");
        int candi = sc.nextInt ();
        for (int j = 0; j < a.length ; ++j){
            if(a[j] == candi) {
                gotit = true;
                break;
            }
        }
        if (gotit){
                System.out.println("Yes");
            } else  { 
               System.out.println ("No");
            }
    }
}
            