import java.util.Scanner;
public class Task15 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        String s1 = sc.nextLine();
        char [] arry1 = s1.toCharArray();
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        
        if (index1 < arry1.length && index2 < arry1.length){
        for (int i = index1; i < index2+1 ; i++) {
        System.out.print (arry1 [i]);
        }
        }
        else {
        System.out.print ("Wrong Input");
        }
    }
}