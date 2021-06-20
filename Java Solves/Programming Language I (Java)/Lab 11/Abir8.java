import java.util.Scanner;
public class Abir8{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        String[] a = {"one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" ,"nine" , "ten"};
        int n = sc.nextInt();
        System.out.println (a[n - 1]);
    }
}