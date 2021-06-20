import java.util.Scanner;
public class Task12 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First Month ");
        int a = sc.nextInt();
        System.out.println("Enter First Date ");
        int b = sc.nextInt();
        System.out.println("Enter Second Month ");
        int x = sc.nextInt();
        System.out.println("Enter Second Date ");
        int y = sc.nextInt();
        
        whichComesFirst (a,b,x,y);
    }
    
    public static void whichComesFirst (int a, int b, int x, int y){
        if (a < x) {
          System.out.println("TRUE");
        }
        
        if (a > x) {
          System.out.println("FALSE");
        }
        
        if (a == x) {
            if (b < y){
            System.out.println("TRUE");
            }
            else {
            System.out.println("FALSE");
            }
        }
    }
}
       