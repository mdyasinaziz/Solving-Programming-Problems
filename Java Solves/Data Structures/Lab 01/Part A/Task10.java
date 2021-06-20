import java.util.Scanner;
public class Task10 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Month ");
        double x = sc.nextDouble();
        System.out.println("Enter Date ");
        double y = sc.nextDouble();
        
        season (x, y);
    }
    
    public static void season (double a, double b){
        b = b / 100;
        a = a + b;
        
        if (a == 12.16 || ((a >= 1.00 && a <= 3.15))){
            System.out.println("Winter ");
        }
        
        if (a >= 3.16 && a <= 6.15){
            System.out.println("Spring ");
        }
        
        if (a >= 6.16 && a <= 9.15){
            System.out.println("Summer ");
        }
        
        if (a >= 9.16 && a <= 12.15){
            System.out.println("Fall ");
        }
    }
}