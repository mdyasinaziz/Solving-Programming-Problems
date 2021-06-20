import java.util.*;

public class Task14{
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          
          int height = sc.nextInt();
          int width = sc.nextInt();
          boolean firstOrLastLine = false;
          
          
          for(int lineIndex = 0; lineIndex < height; lineIndex++){
               firstOrLastLine = (lineIndex == 1 || height == lineIndex);
               
               
               for(int starIndex = 0; starIndex < width; starIndex++){
                    if(firstOrLastLine){
                         System.out.print("*");
                    } else {
                         if(starIndex == 0 || width - starIndex == 1){
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