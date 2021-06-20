import java.util.Scanner;
public class Task3 {
  public static void main (String args []){
    Scanner sc = new Scanner (System.in);
    String s = sc.nextLine();
    int c = s.length();
   for (int i = 0 ; i < c ; i++){
      char b =  s.charAt(i);
      int j = (int) b;
      
      System.out.println (b + " " + j);
    }
  }
}
