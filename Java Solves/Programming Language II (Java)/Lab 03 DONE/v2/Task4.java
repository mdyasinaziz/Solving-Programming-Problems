import java.util.Scanner;
public class Task4{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        char [] a = s.toCharArray();
        int mario = 1;
        for(int i = 0; i < a.length ; i++){
            for (int j = 0 ; j < mario; j++) {
                char b = s.charAt(j);
                int k = (int) b;
                System.out.print((char)k);
            }
            mario++;
            System.out.println();
        }
    }
}