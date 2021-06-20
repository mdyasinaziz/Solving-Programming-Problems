import java.util.*;

public class Task15 {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          
          int height = sc.nextInt();
          int width = sc.nextInt();
          boolean firstOrLastLine = false;
          
          
          for(int lineIndex = 0; lineIndex < height; lineIndex++){
              firstOrLastLine = (lineIndex == 1 || height == lineIndex);
               
               
               for(int starIndex = 1; starIndex <= width; starIndex++){
                    if(firstOrLastLine){
                         System.out.print(starIndex);
                    } else {
                         if(starIndex == 1 || width - starIndex == 0){
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