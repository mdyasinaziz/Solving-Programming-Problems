public class ArrayQueue implements Queue{
    int size;
    int front;
    int rear;
    Patient [] data;
    
    public ArrayQueue(){
        size=0;
        front = -1;
        rear = -1;
        data = new Patient[5];
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
    
    public void enqueue(Patient o) throws QueueOverflowException {
        try {
            data [size] = o;
            size++;
        } catch (Exception c){
          throw new QueueOverflowException();
        }
    }
    
    public Patient dequeue() throws QueueUnderflowException {
        try {
            Patient oldData = data [front + 1];
            data [front + 1] = null;
            size--;
            front++;
            return oldData;
        } catch (Exception c){
          throw new QueueUnderflowException();
        }
    }
    
    public Patient peek () throws QueueUnderflowException {
         try {
            return data [front + 1];
         } 
         catch (Exception c){
          throw new QueueUnderflowException();
        }
    }
    
    public String toString () {
        String s = "";
        if (size >0) {
            for (int i = front + 1; i < data.length; i++) {
                s = s.concat (data [i].toString());
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
        for (int i = 0; i < size; i++) {
            newObj [i] = data [front+i+1];
        }
        return newObj;
    }
    
    public int search (Patient c) {
        int x = 0;
        for (int i = 0; i < size; i++) {
            if (data [i] == c) {
                return i;
            }
        }
            return -1;
    }
    

    
}