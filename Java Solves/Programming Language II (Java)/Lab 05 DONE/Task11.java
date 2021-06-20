import java.util.Scanner;
public class Task11 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        String s1 = sc.nextLine();
        char [] c1 = s1.toCharArray();
        String s2 = sc.nextLine();
        char [] c2 = s2.toCharArray();
        int [] arryc1 = new int [c1.length];
        int [] arryc2 = new int [c2.length];
        boolean b = false;
        for (int i = 0; i < arryc1.length; i++) {
            char carry = c1[i];
            arryc1 [i] = (int) carry;
        }
        for (int i = 0; i < arryc2.length; i++) {
            char carry = c2[i];
            arryc2 [i] = (int) carry;
        }
        
        if (arryc1.length == arryc2.length) {
            for (int i = 0; i < arryc1.length; i++) {
                if (arryc1 [i] - arryc2 [i] == 0 || arryc1 [i] - arryc2 [i] == 32 || arryc2 [i] - arryc1 [i] == 32) {
                b = true;
                }
                else {
                b = false;
                }
            }
        }
        System.out.println(b);
    }
} 
        