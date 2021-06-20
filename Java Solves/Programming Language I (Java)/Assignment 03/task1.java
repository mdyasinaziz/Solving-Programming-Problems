import java.util.Scanner;
public class task1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Please enter your mark: ");
        int mark = sc.nextInt();
        
        if(mark > 50)
            System.out.println("Pass");
        else
            System.out.println("You shall not pass");
    }
}