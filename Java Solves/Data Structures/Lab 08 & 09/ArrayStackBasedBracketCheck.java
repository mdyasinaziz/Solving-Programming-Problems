import java.util.Scanner;
public class ArrayStackBasedBracketCheck{
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        char [] equa = s.toCharArray();
        ArrayStack a = new ArrayStack();
        ArrayStack b = new ArrayStack();
        int i; char backup = '.'; String openorclose = " Closed!";
        for (i = 0; i < equa.length; i++) {
            if ( equa [i] == '(' ||  equa [i] == '{' ||  equa [i] == '[' ) {
                try {
                    a.push(equa [i]);
                    b.push (i+1);
                }
                catch (Exception e) {
                    System.out.println("hudai !!!");
                }
            }
            else if ( equa [i] == ')' ||  equa [i] == '}' ||  equa [i] == ']' ) {
                try {
                    if (check (equa [i], (char) a.peek())) { 
                        a.pop();  b.pop(); 
                    }
                    else {
                        backup = (char) a.peek();
                        break;
                    }
                }
                catch (Exception e) {
                    System.out.println("This Expression isn't correct ");
                    backup = (char) equa [i];
                    try {b.push (i+1);} catch (Exception f) {}
                    openorclose = " Opened!";
                    break;
                }
            }
        }
        
        try {
            if (i == equa.length) {
                System.out.print ("This Expression is correct"); 
            }
            else {  
                System.out.println ("This Expression isn't correct"); 
                System.out.println ("Error at character # " + b.pop() + "'"+ backup + "'" + " - isnt" + openorclose); 
            }
        }
        catch (Exception e) {
            System.out.println("hudai3 !!!");
        }
    }
    
    public static boolean check (char a, char b) {
        if (a == ')' && b == '(') { return true; }
        else if (a == '}' && b == '{') { return true; }
        else if (a == ']' && b == '[') { return true; }
        else { return false; }
    }
}