public class TesterTask06 {
    public static void main (String [] args) {
        int [] arr = {10,20,30,40,50,60};
        RecursionLList r = new RecursionLList (arr);
        r.makeRecurLList();
        for (Node c = r.head; c != null; c = c.next) {
        System.out.println (c.element);
        }
        System.out.println ("The Sum is: " + r.sum + ".");
}
}

