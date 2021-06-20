//public class LinkedList{
//  public Node head;
//  
//  
//  /* First Constructor:
//   * Creates a linked list using the values from the given array. head will refer
//   * to the Node that contains the element from a[0]
//   */ 
//  public LinkedList(Object [] a){
//      head = new Node (a[0], null);
//      Node tail = head;
//      for (int i = 1; i < a.length; i++) {
//      Node n = new Node (a[i], null);
//      tail.next=n;
//      tail = n;
//      }
//  }
//  
//  /* Second Constructor:
//   * Sets the value of head. head will refer
//   * to the given LinkedList
//   */
//  public LinkedList(Node h){
//      System.out.println ();
//      head = h; Node traver = head;
//      Node tail = head;
//      for (Node c = traver; c != null; c = c.next) {
//      }
//  }
//  
//  /* Counts the number of Nodes in the list */
//  public int countNode(){
//      Node traver = head; int counter = 0;
//      for (Node c = traver; c != null; c = c.next) {
//          counter++;
//      } 
//      return counter;
//  }
//  
//  
//  /* prints the elements in the list */
//  public void printList(){
//      Node traver = head;
//      for (Node c = traver; c != null; c = c.next) {
//          System.out.println (c.element);
//      } 
//  }
//  
//  // returns the reference of the Node at the given index. For invalid index return null.
//  public Node nodeAt(int idx){
//   Node traver = head; Node ret = null; int counter = 0; boolean flag = false;
//      for (Node c = traver; c != null; c = c.next) {
//          if (idx == counter) { ret = c; flag = true; break; }
//          counter++;
//      }
//      if (!flag) { return null;}
//      else {return ret; }
//  }
//  
//  
//// returns the element of the Node at the given index. For invalid idx return null.
//  public Object get(int idx){
//     Node traver = head; Object ret = null; int counter = 0; boolean flag = false;
//      for (Node c = traver; c != null; c = c.next) {
//          if (idx == counter) { ret = c.element; flag = true; break; }
//          counter++;
//      }
//      if (!flag) { return null;}
//      else {return ret; }
//  }
//  
//  
//  
//  
//  /* updates the element of the Node at the given index. 
//   * Returns the old element that was replaced. For invalid index return null.
//   * parameter: index, new element
//   */
//  public Object set(int idx, Object elem){
//     Node traver = head; Object ret = null; int counter = 0; boolean flag = false; Object temp = 0;
//      for (Node c = traver; c != null; c = c.next) {
//          if (idx == counter) { temp = c.element; c.element = elem; flag = true; break; }
//          counter++;
//      }
//      if (!flag) { return null;}
//      else {return temp; }
//  }
//  
//  
//  /* returns the index of the Node containing the given element.
//   if the element does not exist in the List, return -1.
//   */
//  public int indexOf(Object elem){
//      Node traver = head; int counter = 0; boolean found = false;
//      for (Node c = traver; c != null; c = c.next) {
//          if (c.element == elem) { 
//              found = true;
//              break;
//          }
//          counter++;
//      }
//      if (found) {
//      return counter;
//  }
//      else { return -1 ;
//      }
//  }
//  
//  
//  // returns true if the element exists in the List, return false otherwise.
//  public boolean contains(Object elem){
//    Node traver = head; int counter = 0; boolean found = false;
//      for (Node c = traver; c != null; c = c.next) {
//          if (c.element == elem) { 
//              found = true;
//              break;
//          }
//      }
//      return found;
//  }
//  
//  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
//  public Node copyList(){
//      Node trans = head;
//      Node nHead = new Node(trans.element, null);
//      Node nTrans = nHead;
//      trans = trans.next;
//      for(Node c = trans ; c!=null ; c = c.next) {
//          Node n = new Node(c.element , null);
//          nTrans.next = n;
//          nTrans = n;
//      }
//      return nHead; 
//  }
//  
//  
//  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
//  public Node reverseList(){
//    System.out.println ();
//        Node prev = null; 
//        Node next = null; 
//        for (Node current = head; current != null;) { 
//            next = current.next; 
//            current.next = prev; 
//            prev = current; 
//            current = next; 
//        } 
//        head = prev; 
//        return head; 
//  }
//  
//  /* inserts Node containing the given element at the given index
//   * Check validity of index.
//   */
//  public void insert(Object elem, int idx){
//    System.out.println();
//    Node k = new Node (elem, null);
//    int counter = 0;
//    if (idx == 0) { 
//        k.next = head;
//        head = k;
//    } else {
//    for (Node c = head; c != null; c = c.next) {
//        if (counter == idx-1) {
//        k.next = c.next;
//        c.next = k;
//        }
//        counter++;
//    }
//    }
//  }
//  
//  
//  /* removes Node at the given index. returns element of the removed node.
//   * Check validity of index. return null if index is invalid.
//   */
//  public Object remove(int index){
//      System.out.println(); 
//      Node prev = new Node (null, null);
//      Node next = new Node (null, null);
//      int counter = 0; Object ret = null;
//      if (index == 0) {
//          ret = head.element;
//          head = head.next;
//      }
//      
//      else {
//          for (Node c = head; c != null; c = c.next) {
//              if (counter == index-1) {
//                  prev = c;
//              }
//              if (counter == index+1) {
//                  next = c;
//              }
//              if (counter == index) {
//                  ret = c.element;
//              }
//              counter++;
//          }
//      prev.next = next;
//      }
//      return ret;
//      }
//  
//  
//  // Rotates the list to the left by 1 position.
//  public void rotateLeft(){
//      Node backupHead = head;
//      Node z = head.next;
//      head = z;
//      Node last = new Node (null, null);
//      for (Node c = z; c != null; c = c.next) {
//          last = c;
//      }
//      //System.out.println (last.element);
//      System.out.println ();
//      last.next = backupHead;
//      backupHead.next = null;
//  }
//  
//  // Rotates the list to the right by 1 position.
//  public void rotateRight(){
//     System.out.println ();
//     for(Node c = head; c != null; c = c.next) {
//        if((c.next).next==null) {
//            Node temp = c.next;
//            c.next = null;
//            temp.next = head;
//            head = temp;
//            break;
//        }
//    }
//}
//  
//}