import java.util.*;
class MyReader {

    int readInteger() throws EitaIntegerNoiException{
    Scanner sc = new Scanner(System.in);
    int ans = -1;
    String s = sc.nextLine();
    if (s.contains(".")) {
      throw new EitaIntegerNoiException("error");
    } 
    else {
      return ans=Integer.parseInt(s);
    }
  }
}