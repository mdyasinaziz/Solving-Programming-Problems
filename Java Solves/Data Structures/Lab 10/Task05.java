public class Task05 {

  public static void main(String[] args) {
    System.out.println(pow(2, 4));
  }
  
  public static long pow(long m, long n) {
      if (n > 1){
            return pow(m, (n / 2)) * pow(m, (n - (n / 2)));
      }
      else if (n <= 0){
            return 1;
      }
      else{
            return m;
      }
    }
}
  