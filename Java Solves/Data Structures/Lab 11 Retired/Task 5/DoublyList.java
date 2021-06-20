public class DoublyList{
    public Node head;

     public DoublyList(Object [] a){
        head = new Node(a[0], null, null);
        Node tail = head;
        for(int i = 1; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
    }
 
    public int countNode(){
        Node go = head; int counter = 0;
        System.out.println ();
        for(Node c = go.next; c.element != null; c= c.next){
           counter++;
        }
        return counter;
    }
    
    public void forwardprint(){
        Node go = head;
        Node c = null;
        for(c = go; c.next != null ; c= c.next){
           System.out.print (c.element + ", ");
        }
        System.out.println (c.element + ".");
    }
    
 
    
    
}