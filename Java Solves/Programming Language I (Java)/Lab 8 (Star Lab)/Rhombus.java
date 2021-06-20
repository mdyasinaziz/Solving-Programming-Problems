import java.util.Scanner;
public class Rhombus{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int fspaceCount = n;
        int sspaceCount = 1;
        int fmiddle = 1;     
        int smiddle = ((n*2)-5);
        for (int line = 1; line <= n ; line ++){
            for (int fspace = 1; fspace <= (fspaceCount - 1) ; fspace++){
                System.out.print(" ");
            }
            fspaceCount--;
            if (line == 1){
                System.out.print("*");
            }
            else if (line == n){
                System.out.print("*");
                for (int i = 1; i <= ((n*2)-3); i++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else {
                System.out.print("*");
                for (int i = 1; i <= fmiddle ; i++){
                    System.out.print(" ");
                }
                System.out.print("*");
                fmiddle = fmiddle + 2;
            }
            System.out.println();
        }
        
        for (int line = 1; line <= n - 1 ; line ++){
            for (int spspace = 1; spspace <= sspaceCount ; spspace++){
                System.out.print(" ");
            }
         sspaceCount++;
            if (line == n-1){
                System.out.print("*");
            }
            
            else {
                System.out.print("*");
                for (int i = 1 ; i <= smiddle ; i++){
                    System.out.print(" ");
                }
                System.out.print("*");
                smiddle = smiddle - 2;
            }
            System.out.println();
        }
    }
}
