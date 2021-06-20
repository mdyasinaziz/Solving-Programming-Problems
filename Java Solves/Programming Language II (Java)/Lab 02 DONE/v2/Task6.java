import java.util.Scanner;
public class Task6{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int xx = sc.nextInt();
        int sum = 0;
        int minus = 1;
        int messi = 0;
        for (int i = 1; i <= xx ; i++) {
            messi = i * i;
            messi = messi * minus;
            sum = sum + messi;
            minus = minus * (-1);
        }
        System.out.println ("y = " + sum);
    }
}
        
        