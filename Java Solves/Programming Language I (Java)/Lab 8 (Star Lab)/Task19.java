import java.util.*;

public class Task19 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int height = sc.nextInt();
    int spaceCount = height;
    boolean firstOrLastLine = false;
    
    
    for(int lineIndex = 1; lineIndex <= height; lineIndex++){
      spaceCount--;
      int space;
      for(space = 0; space < spaceCount ; space++){
        System.out.print(" ");
      }
      
      for(int starIndex = 1; starIndex <= lineIndex; starIndex++){
        if(lineIndex == height){
          System.out.print(space + 1);
        }
        else if(starIndex == 1 || lineIndex == starIndex){
          System.out.print(space + 1);
          
        }
        else {
          System.out.print(" ");
        }
        space++;
      }
      
      
      System.out.println();
    }
  }
}