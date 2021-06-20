import java.util.*;

public class Task17 {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          
          int height = sc.nextInt();
          boolean firstOrLastLine = false;
          
          
          for(int lineIndex = 1; lineIndex <= height; lineIndex++){
               firstOrLastLine = (lineIndex == 1 || height == lineIndex);
               
               for(int starIndex = 1; starIndex <= lineIndex; starIndex++){
                    if(firstOrLastLine){
                         System.out.print(starIndex);
                    } else {
                         if(starIndex == 1 || lineIndex == starIndex){
                              System.out.print(starIndex);
                         } else {
                              System.out.print(" ");
                         }
                    }
               }
               
               
               System.out.println();
          }
     }
}