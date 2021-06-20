import java.util.Scanner;
public class Task12 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        String s1 = sc.nextLine();
        char [] arry1 = s1.toCharArray();
        String s2 = sc.nextLine();
        char [] arry2 = s2.toCharArray();
        int result = 0;
        int arry1Tale = 0;
        int arry2Tale = 0;
        if (arry1.length > arry2.length) {
            for (int i = 0; i < arry1.length; i++ ){
                if (i == arry2.length){
                    arry2Tale--;
                }
                else if (arry1 [i] == arry2 [arry2Tale]){
                arry2Tale++;
                }
                else {
            result = result + (arry1[i] - arry2 [arry2Tale]);
            arry2Tale++;
                }
            }
        }
        if (arry2.length > arry1.length) {
            for (int i = 0; i < arry2.length; i++ ){
                if (i == arry1.length){
                    arry1Tale--;
                }
            result = result + (arry1[arry1Tale] - arry2 [i]);
            arry1Tale++;
            }
        }
        if (arry2.length == arry1.length) {
            result = result + (arry1[0] - arry2 [0]);
        }
        
        System.out.println (result);
    }
}