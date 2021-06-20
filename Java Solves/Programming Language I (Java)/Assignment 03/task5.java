import java.util.Scanner;
public class task5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Please enter number of seconds: ");
        int seconds = scanner.nextInt();
        int minutes = seconds/60;
        seconds -= (seconds%60);
        int hours = minutes/60;
        minutes -= (minutes%60);
        System.out.println(hours + " Hours, " + minutes + " minutes & " + seconds + " seconds");
    }
}