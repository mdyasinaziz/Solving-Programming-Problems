import java.util.Scanner;
public class task3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Please enter the height of the rectangle: ");
        float height = scanner.nextFloat();
        System.out.println("Please enter the width of the rectangle: ");
        float width = scanner.nextFloat();
        float area = width * height;
        
        System.out.println(area);
    }
}