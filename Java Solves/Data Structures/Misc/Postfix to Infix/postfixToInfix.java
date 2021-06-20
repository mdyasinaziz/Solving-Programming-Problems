import java.util.Scanner;
public class postfixToInfix  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String post = sc.nextLine();
        char[] pfix = post.toCharArray();
        ListStack a = new ListStack();
        for(int i=0; i<pfix.length; i++) {
            if((int)pfix[i]== 42 || (int)pfix[i]== 43 || (int)pfix[i]== 45 || (int)pfix[i]== 47 || (int)pfix[i]== 37) {
                //the numbers are math operators
                try {
                    String f = a.pop().toString();
                    String s = a.pop().toString();
                    String temp = "("+s+pfix[i]+f+")";
                    System.out.println(temp);
                    a.push(temp);
                    
                } catch(Exception e) {
                    System.out.println("Something went Wrong");
                }
            } //Other Char
            else {
                a.push(pfix[i]);
            }
        }        
    }
}

//        try {String infix = a.pop().toString();
//            System.out.println(infix);} catch (Exception e) {
//                System.out.println("Something went Wrong");
//            }
//            123%5263-/+2+*1-+0+
//            123%5263-/+2+*1-+0+
//            1(2%3)5(2/(6-3))
//            (1+(2%3*(5+2/(6-3)+2)-1)+0)    