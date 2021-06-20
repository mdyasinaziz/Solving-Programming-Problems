public class RecursionLList{
    public int [] a;
    Node head = null;
    Node tail = head;
    public int i = 1;
    
    public RecursionLList (int [] arr){
    a = arr;
    head = new Node (a[0], null);
    tail = head;
    }
    
    public void makeRecurLList () {
        if (i >= a.length) {
        System.out.println ("In here");
        }
        else {
        Node n = new Node (a[i], null);
        tail.next=n;
        tail = n;
        i++;
        makeRecurLList ();
        }
        }
    
    public void reversePrintTheDamnTing (Node h) {
        if (h == null) return; 
        else {
        reversePrintTheDamnTing(h.next); 
        }
        System.out.print(h.element+" "); 
    }
    
    
    
}

