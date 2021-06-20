import java.util.Scanner;
public class Task4 {
  public static void main (String args []){
    Scanner sc=new Scanner(System.in);
    int [] a = new int[91];
    String s = sc.nextLine();
    int c = s.length();
    
    for(int i = 0; i < c; i++){
      char b = s.charAt(i);
      int k = (int) b;
      a[k]++ ; 
    }
    
    for(int i=65; i<=90; i++){
      System.out.println((char)i+" was found "+ a[i]+ " times" + " Which is " + i);        
    }
  }
}
