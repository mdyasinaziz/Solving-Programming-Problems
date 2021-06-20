import java.util.Scanner;
public class Task20 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        String s1 = sc.nextLine();
        char [] arry1 = s1.toCharArray();
        String s2 = sc.nextLine();
        char [] arry2 = s2.toCharArray();
        
        for (int i = 0; i < arry1.length; i++) {
        System.out.print(arry1 [i]);
        }
        
        for (int i = 0; i < arry2.length; i++) {
        System.out.print(arry2 [i]);
        }
    }
}
