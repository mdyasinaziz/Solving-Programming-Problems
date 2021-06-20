public class ListStack implements Stack{
    int size;
    Node top;
  
    
    public ListStack(){
        size = 0;
        top = null;
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
    
    public void push (Object e) throws StackOverflowException {
            Node n = new Node (e, top);
            top = n;
            size++;
    }
    
    public Object pop () throws StackUnderflowException {
        try {
        Node k = top;
        top = top.next;
        size--;
        return k.val;
        } catch (Exception a){
        throw new StackUnderflowException();
        }
    }
    
    public Object peek () throws StackUnderflowException {
        try {
            return top.val; 
        }
        catch (Exception a){
            throw new StackUnderflowException();
        }
                   
    }
    
    public String toString () {
        String s = "";
        if (size >0) {
            int c = 0;
            for (Node i = top; i != null; i=i.next) {
                s = s.concat (i.val.toString());
                s = s.concat (" ");
                }
            }
        else {
            s = "Empty Stack";
        }
        return s;
    }
    
    public Object [] toArray () {
        Object [] newObj = new Object [size];
        int i = 0;
        for (Node j = top; i < size; j = j.next ,i++) {
            if (j == null) { break; }
            newObj [i] = j.val;
        }
        return newObj;
    }
    
    public int search (Object c) {
        int x = 0;
        for (Node i = top; i != null; i=i.next) {
            if (i.val == c) {
                return x;
            }
            x++;
        }
            return -1;
    }
    

    
}