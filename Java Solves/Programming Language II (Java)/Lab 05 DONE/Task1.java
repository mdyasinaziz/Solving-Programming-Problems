import java.util.Scanner;
public class Task1{
    public static void main (String [] args){ 
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        char [] c = s.toCharArray();
        int lengthCount = 0;
        for (int i = 0; i < c.length; i++) {
            lengthCount++;
        }
        System.out.println ( "Length of the String is " + lengthCount);
    }
}
            
    