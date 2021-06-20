import java.util.Scanner;
public class Task7 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println ("nth Fib Numb?");
        int x = sc.nextInt();
        long fibArray[]=new long[x+1];
        Task7FibDesign n = new Task7FibDesign (fibArray);
        n.fibArray[0]=1;
        n.fibArray[1]=1;
        long sol = n.fibonacci (x);
        System.out.println ("Found Soliton " + sol);
    } 
}
 
 