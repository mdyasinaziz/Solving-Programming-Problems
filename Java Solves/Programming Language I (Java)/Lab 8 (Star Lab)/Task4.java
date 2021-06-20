import java.util.*;
//import java.lang.System.*;

public class Task4 {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          
          
          int lineCount = sc.nextInt();
          int starCount = sc.nextInt();
          
          for(int i = 1; i <= lineCount; i++){
               for(int j = 1; j <= starCount; j++){
                    System.out.print(j);
               }
               System.out.println();
          }
     }
}