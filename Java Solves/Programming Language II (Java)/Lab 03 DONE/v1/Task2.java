import java.util.Scanner;
public class Task2 {
  public static void main (String args []){
    Scanner sc = new Scanner (System.in);
    String s = sc.nextLine();
    int j = s.length();
    
    for (int i = 0 ; i < j ; i++){
      char c =  s.charAt(i);
      System.out.println (c);
    }
  }
}
