import java.util.Scanner;
public class Task02 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Type Koren ");
        String n = sc.nextLine();
        char [] ch = n.toCharArray();
        int [] counter = new int [100];
        for (int i = 0; i < ch.length ; i++){
            if (ch[i] > 64 && ch[i] < 91){
                int k = (int) ch [i];
                counter [k]++;
            }
            else {
            System.out.print("");
            } 
        }
        for (int i = 0; i < counter.length ; i++){
            if (counter [i] == 0){
            System.out.print("");
            }
            else {
                System.out.println(i);
                System.out.println(counter[i]);
            }
    }  
}
}
