import java.util.*;
public class Task10 {
  public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    String s = sc.nextLine(); 
    char[] a = s.toCharArray();
    int limit = 0;
    for(int i=0; i<a.length; i++) { 
      if((int) a[i]>=65 && (int)a[i]<=90) {
        for (int j=i; j>=limit; j--) {
          System.out.print(a[j]);
        }
        limit= i + 1;
      }
    }
  }
}