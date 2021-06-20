import java.util.Scanner;
public class Task19 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        String s1 = sc.nextLine();
        char [] arry1 = s1.toCharArray();
        String s2 = sc.nextLine();
        char [] arry2 = s2.toCharArray();
        int firstindex = sc.nextInt();
        boolean flag = false;
        for (int i = firstindex ; i < arry1.length ; i++) {
            if (arry1[i] == arry2[0]){
            System.out.print (i - firstindex);
            flag = true;
            break;
            }
        }
        if (flag == false){
        System.out.print ("-1");
        }
    }
}