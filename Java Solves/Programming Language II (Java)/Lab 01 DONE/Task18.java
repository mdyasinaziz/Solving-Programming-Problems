import java.util.*;

public class Task18 {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          
          int lineCount = sc.nextInt();
          int spaceCount;
          
          for(int i = 1; i <= lineCount; i++){
               spaceCount = lineCount - i;
               for(int j = 1; j <= spaceCount; j++){
                    System.out.print(" ");
               }
               for(int j = 0 ; j< i; j++){
                    System.out.print("*");
               }
               System.out.println();
          }
     }
}