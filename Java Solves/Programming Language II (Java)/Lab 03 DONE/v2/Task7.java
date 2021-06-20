import java.util.Scanner;
public class Task7{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String a = sc.nextLine();
    char [] x = a.toCharArray();
    for(int i = 0; i < x.length; i++) {
      for (int j=i+1; j < x.length; j++) {
        if(x [i] == x [j]) {
          x [j] = '!'; 
        }
      }
    }
      for (int i =0;  i < x.length; i++) { 
        if (x[i] != '!') {
          System.out.print( x[i] );
        }
      }
  }
}