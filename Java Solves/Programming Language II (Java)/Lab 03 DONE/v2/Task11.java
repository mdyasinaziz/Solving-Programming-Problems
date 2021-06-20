import java.util.Scanner;
public class Task11 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println ("Please Enter the Word ");
        String s = sc.nextLine();
        char [] a = s.toCharArray();
        System.out.println ("Please Enter the times you Want to skip Alphabets ");
        int n = sc.nextInt();
        for(int i = 0; i < a.length; i++){
            char b = s.charAt(i);
            int k = (int) b;
            k = k + n;
            if (k > 90) {
            k = k - 90;
            k = 64 + k;
            }
            System.out.print ((char)k);
        }
    }
}