import java.util.Scanner;
public class Task3{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        char [] a = s.toCharArray();
        
        for(int i = 0; i < a.length; i++){
            char b = s.charAt(i);
            int k = (int) b;
            k--;
            System.out.print ((char)k);
        }
    }
}