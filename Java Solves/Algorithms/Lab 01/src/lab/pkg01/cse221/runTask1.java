package lab.pkg01.cse221;

import java.util.Stack;
public class runTask1 {

    public runTask1 () {
    Stack <Integer> stack = new Stack <Integer> ();    
        int a = 10;
        stack.push (10);
        System.out.println ("Pushing " + a + "....");
        System.out.println ("Printing Top ");
        System.out.println (stack.peek());
        
        a = 5;
        stack.push (5);
        System.out.println ("Pushing " + a + "....");
        System.out.println ("Printing Top ");
        System.out.println (stack.peek());
        
        System.out.println ("Popping... ");
        stack.pop();
        System.out.println ("Printing Top ");
        System.out.println (stack.peek());
    }
    
    
}
