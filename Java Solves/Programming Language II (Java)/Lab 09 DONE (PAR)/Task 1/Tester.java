import java.util.Scanner;
public class Tester {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter the radius of the Circle: ");
        double x = sc.nextDouble();
        System.out.print ("Enter the radius of the Sphere: ");
        double y = sc.nextDouble(); 
        
        Circle c1 = new Circle (x);
        c1.makeCircle(); 
        Sphere s1 = new Sphere (y);
        s1.makeSphere();
    }
}
