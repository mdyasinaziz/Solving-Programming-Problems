import java.util.Scanner;

public class task7{
    public static void main (String [] args){
        Scanner kb = new Scanner (System.in);
        int quan = kb.nextInt();
        int first = kb.nextInt();
        int max = first;
        int min = first;
        int sum = first;
        
        for (int count = 1; count <= quan-1 ; count++){
            int another = kb.nextInt();
            if (another > max){
                max = another;
            }
            else if (another < min){
                min = another;
            }
            sum += another;
        }
            double avg = sum / quan;
            System.out.println (max);
            System.out.println (min);
            System.out.println (avg);
    }
}