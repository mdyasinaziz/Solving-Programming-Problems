public class TesterTask07 {
    public static void main (String [] args) {
        int [] arr = {10,20,30,40,50,60};
        RecursionLList r = new RecursionLList (arr);
        r.makeRecurLList();
        System.out.println (r.head.element);
        r.reversePrintTheDamnTing(r.head);
}
}

