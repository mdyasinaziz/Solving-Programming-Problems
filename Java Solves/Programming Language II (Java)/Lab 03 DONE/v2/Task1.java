import java.util.Scanner;
public class Task1{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        char [] a = s.toCharArray();
        char tem;
        String sorted = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0 ;  j < a.length; j++){
                if (a [i] < a[j]){
                    tem = a [i];
                    a[i] = a[j];
                    a[j] = tem;
                }
            }
        }
        for (int k = 0; k < a.length; k++){
            sorted = sorted + a[k];
        }
        System.out.println(sorted);
    }
}
        
                        