import java.util.Scanner;
public class Task9 {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Please Enter team name: ");
    String t = sc.nextLine();
    System.out.println("Please Enter coach name: ");
    String c = sc.nextLine();
    char[] a1 = t.toCharArray(); 
    char[] a2 = c.toCharArray(); 
    int team = 1, coach = 1;
    for(int i=0; i<a1.length; i++) {
      team *=((int) a1[i]- 64);
    }
    for(int i=0; i<a2.length; i++) {
      coach *=((int)a2[i] -64);
    }
    if(team%14<coach%14) {
      System.out.println("I Am Happy With My Coach ");
    }
    else 
        System.out.println("I Am Sad With My Coach ");
  }
}