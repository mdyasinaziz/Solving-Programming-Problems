public class DoublyList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head = new Node(null, null, null);
        Node tail = head;
        
        for(int i = 0; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
        Node go = head; int counter = 0;
        System.out.println ();
        for(Node c = go.next; c.element != null; c= c.next){
           counter++;
        }
        return counter;
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
        Node go = head;
        
        for(Node c = go.next; c.element != null; c= c.next){
            System.out.print (c.element + "|");
        }
    }
    
    public void backwardprint(){
        System.out.println ();
        Node go = head;
        
        for(Node c = go.prev; c.element != null; c= c.prev){
            System.out.print (c.element + "|");
        }  
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        System.out.println ();
        Node go = head; Node ret = null;
        int counter = 0;
        for(Node c = go.next; c.element != null; c= c.next){
            if (counter == idx) { ret = c; break;}
            counter++;
        }
        return ret;
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        System.out.println ();
        Node go = head; 
        int counter = 0; boolean found = false;
        for(Node c = go.next; c.element != null; c= c.next){
            if (c.element == elem) { found = true; break;}
            counter++;
        }
        if (found) {
        return counter;
        }
        else {
        return -1;
        }
    }
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        System.out.println ();
        Node z;
        int i = 0;
        if (idx >= 0) {
         for(Node c = head.next; c.element != null; c= c.next){
            if (i == idx) {
            Node k = new Node (elem, c, c.prev);
            c.prev = k;
            (k.prev).next = k;
                
            }
            i++;
        }
        }
        else {
            System.out.println ("Invalid Input"); 
        }
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        
        Node z;
        int i = 0; Object k = null;
        System.out.println ();
        
        
        if (index >= 0) {
        for(Node c = head.next; c.element != null; c= c.next){
            if (i == index) {
            k = c.element;
            (c.prev).next = c.next;
            (c.next).prev = c.prev;
            break;   
            }
            i++;
        }
        }
        else {
            System.out.println ("Invalid Input"); 
        }
        return k;
    }
    
    
    
    
}