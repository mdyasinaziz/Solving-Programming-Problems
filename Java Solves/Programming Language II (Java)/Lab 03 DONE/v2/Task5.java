import java.util.Scanner;
public class Task5{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int mario = 0;
        int t; int i; String finalo = "";
        char r = ' ';
        for (t = 1; t <= 1 ; t++){
            String s = sc.nextLine();
            char [] a = s.toCharArray();
            for(i = 0; i < a.length ; i++){
                char o = s.charAt(i);
                int q = (int) o;
                for (int j = 0 ; j < i; j++) {
                    char b = s.charAt(j);
                    int k = (int) b;
                    if (q == k) {
                        mario++;
                        r = b; 
                    }
                }
            }
            if (mario >= 1) {
                System.out.println(r + " has been counted 2 times in the word " + s);
                System.out.println("Please enter another word ");
                i = 0;
                t = 0;
                mario = 0;
            }
         finalo = s;    
    }
        System.out.println ("Your Entered " + finalo);
}
}