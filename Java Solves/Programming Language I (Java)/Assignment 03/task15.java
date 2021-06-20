import java.util.Scanner;
public class task15 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the hour");
        int hour = scanner.nextInt();
        
        if(hour>=0 && hour < 24){
            if(hour <= 6 && hour >= 4)
                System.out.println("Breakfast");
            else if (hour == 12 || hour == 13)
                System.out.println("Lunch");
            else if (hour == 16 || hour == 17)
                System.out.println("Snacks");
            else if (hour == 19 || hour == 20)
                System.out.println("Dinner");
            else
                System.out.println("Patience is virtue");
        } else {
            System.out.println("Wrong time");
        }
    }
}