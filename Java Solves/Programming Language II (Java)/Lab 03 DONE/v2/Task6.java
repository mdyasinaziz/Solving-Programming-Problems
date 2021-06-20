import java.util.Scanner;
public class Task6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String a = sc.nextLine();
    String b = sc.nextLine();
    a = a.concat(" ").concat(b);
    char[] x = a.toCharArray();
    int sum = 0;
    for (int i = 0; i < x.length; i++) {
      if (x [i] == ' ') {
      continue; 
      }
      sum+= (int) x[i];
    }
    System.out.println(a + "\n" + sum); 
  }
}