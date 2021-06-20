import java.util.Scanner;
public class Task3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        try{
          int x,n=sc.nextInt();
          int a[]=new int[n];
          a[5]=99;
          x=n/0;
        } catch(ArrayIndexOutOfBoundsException a)
        {
          System.out.println("Array Index OUT");
        } catch(ArithmeticException a)
        {
          System.out.println("Arithmetic Error");
        } finally {
          System.out.println("THE END");
        }
 
    }
}