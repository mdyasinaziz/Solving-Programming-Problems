import java.util.Scanner;
public class Task14 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        String s1 = sc.nextLine();
        char [] arry1 = s1.toCharArray();
        int index = sc.nextInt();
        if (index < arry1.length){
        for (int i = index; i < arry1.length; i++) {
        System.out.print (arry1 [i]);
        }
        }
        else {
        System.out.print ("Wrong Input");
        }
    }
}