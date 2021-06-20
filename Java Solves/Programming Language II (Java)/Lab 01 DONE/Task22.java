import java.util.*;

public class Task22 {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          
          int height = sc.nextInt();
          boolean firstOrLastLine = false;
          
          
          for(int lineIndex = 1; lineIndex <= height; lineIndex++){
               firstOrLastLine = (lineIndex == 1 || height == lineIndex);
               
               for(int starIndex = 1; starIndex <= lineIndex; starIndex++){
                    if(firstOrLastLine){
                         System.out.print("*");
                    } else {
                         if(starIndex == 1 || lineIndex - starIndex == 0){
                              System.out.print("*");
                         } else {
                              System.out.print(" ");
                         }
                    }
               }
               
               
               System.out.println();
          }
     }
}