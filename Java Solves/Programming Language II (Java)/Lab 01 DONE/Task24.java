import java.util.Scanner;
public class Task24{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaceCount = n;
        int x = 0;
        int d = 1;
        for (int line = 1; line <= n ; line++){
            spaceCount--;
            int space;
            for(space = 0; space < spaceCount ; space++){
                System.out.print(" ");
            }
            if (line == 1){
                System.out.print("*");
            }
            else if (line == n){
                for (int i = 1; i <= ((n*2) - 1) ; i++){
                    System.out.print("*");
                }
            }
            else {

                for (int i = 1; i <= 1; i++){
                    System.out.print("*");
                }
                for (int i = 1; i <= x+1; i++){
                    System.out.print(" ");
                }
                for (int i = 1; i <= 1; i++){
                    System.out.print("*");
                }
                x = x+2;
                d = d+2;
            }
            System.out.println();
        }
    }
}
