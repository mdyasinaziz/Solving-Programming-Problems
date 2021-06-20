import java.util.*;
//import java.lang.System.*;

public class Task3 {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          
          
          int lineCount = sc.nextInt();
          int starCount = sc.nextInt();
          
          for(int i = 0; i < lineCount; i++){
               for(int j = 0; j < starCount; j++){
                    System.out.print("*");
               }
               System.out.println();
          }
     }
}