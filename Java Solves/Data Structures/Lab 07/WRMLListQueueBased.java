public class WRMLListQueueBased {
    ListQueue q = new ListQueue ();
    

    public void RegisterPatient(Patient p) throws QueueOverflowException{
        try {
        q.enqueue (p);
        } catch (Exception c){
          throw new QueueOverflowException();
        }
    }
    
    
    
    public Patient ServePatient () throws QueueUnderflowException {
        try {
            Patient served = q.dequeue();
            System.out.println (served.name + " Has been Served");
            return served;
        }
        catch (Exception e) {
            throw new QueueUnderflowException();
        }
    }
    
    
    public void CancelAll() throws QueueUnderflowException{
    try {
            Patient served = q.dequeue();
            CancelAll();
        }
        catch (Exception e) {
            System.out.println ("All Appointments Cancelled! :)");
        }
    }
    
    
    public boolean CanDoctorGoHome(){
        return q.isEmpty(); 
    }
    
    
    public void ShowAllPatient(){
        try {
            if (!q.isEmpty()) {
            Node h = q.front;
            for (int i = 0; i < q.size; i++) {
                System.out.println (h.val.name + " " + h.val.age + " " + h.val.idTheirs + " " + h.val.bloodgroup);
                h = h.next;
            }
            System.out.println();
            }
            else {
            System.out.println ("Cleareeeed");
            }
        }
        catch (Exception e) {
            System.out.println ("Everyone Cleared");
        }
    }
    
    
}
