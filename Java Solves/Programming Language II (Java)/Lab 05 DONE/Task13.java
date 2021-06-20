import java.util.Scanner;
public class Task13 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        String s1 = sc.nextLine();
        char [] arry1 = s1.toCharArray();
        int index = sc.nextInt();
        for (int i = index; i < arry1.length; i++) {
        System.out.println (arry1 [i]);
        }
    }
}