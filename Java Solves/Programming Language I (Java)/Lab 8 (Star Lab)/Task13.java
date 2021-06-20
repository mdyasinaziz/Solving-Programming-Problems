import java.util.*;
//import java.lang.System.*;

public class Task13{
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          
          int lineCount = sc.nextInt();
          int spaceCount = lineCount;
          int starCount = 1;
          
          for(int i = 1; i <= lineCount; i++){
               spaceCount--;
               for(int j = 0; j < spaceCount; j++){
                    System.out.print(" ");
               }
               for(int j = 1; j <= starCount ; j++){
                    System.out.print(j);
               }
               for(int j = 0; j< spaceCount; j++){
                    System.out.print(" ");
               }
               System.out.println();
               starCount += 2;
          }
          starCount -= 2;
          spaceCount++;
          for(int i = lineCount; i > 1; i--){
               starCount -= 2;
               for(int j = 0; j < spaceCount; j++){
                    System.out.print(" ");
               }
               for(int j = 1; j <= starCount ; j++){
                    System.out.print(j);
               }
               for(int j = 0; j< spaceCount; j++){
                    System.out.print(" ");
               }
               spaceCount++;
               System.out.println();
          }
     }
}