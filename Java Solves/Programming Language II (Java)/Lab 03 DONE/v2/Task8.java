import java.util.*;
import java.math.BigInteger;
public class Task8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    BigInteger a = sc.nextBigInteger();
    int sum=0;
    for (BigInteger i=new BigInteger("10"); a.compareTo(i)>0; i=i.multiply(BigInteger.valueOf(10))) {
      int lastDigit=(a.mod(i)).intValue();
      a=a.divide(a);
      sum+=lastDigit;
    }
      
    if(sum%3==0) {
      System.out.println("The number is divisible by 3");
    }
    else 
      System.out.println("The number is NOT divisible by 3");
  }
}