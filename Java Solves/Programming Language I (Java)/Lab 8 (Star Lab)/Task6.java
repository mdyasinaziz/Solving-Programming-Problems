import java.util.*;
//import java.lang.System.*;

public class Task6 {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          
          int lineCount = sc.nextInt();
          
          for(int i = 0; i <= lineCount; i++){
               for(int j = 1; j <= i; j++){
                    System.out.print(j);
               }
               System.out.println();
          }
     }
}