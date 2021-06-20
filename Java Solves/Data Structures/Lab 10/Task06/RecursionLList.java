public class RecursionLList{
    public int [] a;
    Node head = null;
    Node tail = head;
    public int i = 1; public int sum;
    
    public RecursionLList (int [] arr){
    a = arr;
    head = new Node (a[0], null);
    tail = head;
    sum = sum + (int)tail.element;
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
        sum = sum + (int)n.element;
        makeRecurLList ();
        }
        }
    
    
    
}

//public LinkedList(Object [] a){
//      head = new Node (a[0], null);
//      Node tail = head;
//      for (int i = 1; i < a.length; i++) {
//      Node n = new Node (a[i], null);
//      tail.next=n;
//      tail = n;
//      }
//  }