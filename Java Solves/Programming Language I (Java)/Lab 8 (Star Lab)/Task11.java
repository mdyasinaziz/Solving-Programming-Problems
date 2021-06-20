import java.util.*;
//import java.lang.System.*;

public class Task11 {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          
          int lineCount = sc.nextInt();
          int spaceCount;
          
          for(int i = 1; i <= lineCount; i++){
               spaceCount = lineCount - i;
               for(int j = 1; j <= spaceCount; j++){
                    System.out.print(" ");
               }
               for(int j = (i - 1) ; j >= 0; j--){
                    System.out.print(lineCount - j);
               }
               System.out.println();
          }
     }
}