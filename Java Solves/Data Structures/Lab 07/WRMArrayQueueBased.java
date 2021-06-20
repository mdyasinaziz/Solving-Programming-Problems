public class WRMArrayQueueBased {
    ArrayQueue q = new ArrayQueue ();
    

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
            for (int i = 0; i < q.size; i++) {
                System.out.println (q.data[i].name + " " + q.data[i].age + " " + q.data[i].idTheirs + " " + q.data[i].bloodgroup);
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
