import java.util.Scanner;
public class DateTest {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter Month ");
        int x = sc.nextInt();
        System.out.println ("Enter Date ");
        int y = sc.nextInt();
        System.out.println ("Enter Year ");
        int z = sc.nextInt();
        Date k = new Date (x,y,z);
        k.displayDate();
    }
}
        
                                             