import java.util.Scanner;
public class task2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);    
        System.out.print("Please enter your mark: ");
        int mark = scanner.nextInt();
        
        if(mark >= 90)
            System.out.println("A");
        else if(mark >= 80)
            System.out.println("B");
        else if(mark >= 70)
            System.out.println("C");
        else if(mark >= 60)
            System.out.println("D");
        else if(mark >= 50)
            System.out.println("E");
        else
            System.out.println("F");
    }
}