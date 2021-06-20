import java.util.*;

public class Task18 {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          
          int height = sc.nextInt();
          int spaceCount = height;
          boolean firstOrLastLine = false;
          
          
          for(int lineIndex = 1; lineIndex <= height; lineIndex++){
               firstOrLastLine = (lineIndex == 1 || height == lineIndex);
               // System.out.println(spaceCount);
               spaceCount--;
               for(int space = 0; space < spaceCount ; space++){
                    System.out.print(" ");
               }
               
               for(int starIndex = 5; starIndex >= lineIndex; starIndex--){
                    
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