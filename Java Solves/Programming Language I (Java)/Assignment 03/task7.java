import java.util.Scanner;
public class task7 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter the value of x side of triangle: ");
        double x = scanner.nextDouble();
        System.out.println("Enter the value of y side of triangle: ");
        double y = scanner.nextDouble();
        System.out.println("Enter the value of z side of triangle: ");
        double z = scanner.nextDouble();
        
        double s = (x + y + z) / 2;
        double area = s * Math.sqrt((s-x)*(s-y)*(s-z));
        
        System.out.println("Area of the triangle: " + area);}
}
