public class ListQueue implements Queue{
    int size;
    Node front;
    Node rear;
    
    
    public ListQueue(){
        size = 0;
        front = null;
        rear = null;
    }
    
    
    public int size () {
    return size;
    }
    
    public boolean isEmpty () {
        if (size == 0) {
        return true;
        }
        else {
            return false;
        }
    }
    
    public void enqueue (Patient o) throws QueueOverflowException {
            if (size == 0) {
            front = new Node (o, null); 
            rear = front;
            size++;
            }
            else {
            Node k = new Node (o, null);
            rear.next = k;
            rear = k;
            size++;
            }
        }
    
    
    public Patient dequeue() throws QueueUnderflowException {
        try {
            Node oldData = front;
            front = front.next;
            size--;
            return oldData.val;
        } catch (Exception c){
          throw new QueueUnderflowException();
        }
    }
    
    public Patient peek() throws QueueUnderflowException {
         try {
            return front.val;
         } 
         catch (Exception c){
          throw new QueueUnderflowException();
        }
    }
    
    public String toString () {
        String s = "";
        if (size >0) {
            for (Node c = front; c != null; c = c.next) {
                s = s.concat (c.val.toString());
                s = s.concat (" ");
            }
        }
        else {
            s = "Empty Queue";
        }
        return s;
    }
    
    
    
    public Object [] toArray () {
        
        Object [] newObj = new Object [size];
        int i = 0;
        for (Node c = front; c != null; c = c.next) {
            if (i == size) {
            break;
            }
            newObj [i] = c.val;
            i++;
        }
        return newObj;
    }
    
    
    
    public int search (Patient c) {
        int x = 0;
        for (Node i = front; i != null; i=i.next) {
            if (i.val == c) {
                return x;
            }
            x++;
        }
        return -1;
    }
}