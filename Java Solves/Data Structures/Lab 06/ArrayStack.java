public class ArrayStack implements Stack{
    int size;
    Object [] data;
    
    public ArrayStack(){
        size=0;
        data = new Object[5];
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
        try {
            data [size] = e;
            size++;
        } catch (Exception c){
          throw new StackOverflowException();
        }
    }
    
    public Object pop () throws StackUnderflowException {
        try {
            Object oldData = data [size - 1];
            data [size-1] = null;
            size--;
            return oldData;
        } catch (Exception c){
          throw new StackUnderflowException();
        }
    }
    
    public Object peek () throws StackUnderflowException {
         try {
            return data [size-1];
         } 
         catch (Exception c){
          throw new StackUnderflowException();
        }
    }
    
    public String toString () {
        String s = "";
        if (size >0) {
            for (int i = 0; i < size; i++) {
                s = s.concat (data [size-1-i].toString());
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
        for (int i = 0; i < size; i++) {
            newObj [i] = data [size-i-1];
        }
        return newObj;
    }
    
    public int search (Object c) {
        int x = 0;
        for (int i = 0; i < size; i++) {
            if (data [i] == c) {
                return size-1-i;
            }
        }
            return -1;
    }
    

    
}