import java.util.Scanner;
public class Task01 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Type Koren ");
        String n = sc.nextLine();
        char [] ch = n.toCharArray();
        int spaceCounter = 0;
        for (int i = 0; i < ch.length ; i++){
            if (ch[i] > 64 && ch[i] < 123){
                System.out.print(ch[i]);
                spaceCounter = 0;
            }
            if (ch[i] == 32 && spaceCounter == 0){
                System.out.print(" ");
                spaceCounter = 1;
            }
            else {
            System.out.print("");
            }
            
        }
    }
    
}
