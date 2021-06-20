import java.util.Scanner;
public class Tester{
  public static void main (String[]args) throws Exception{
    Scanner k = new Scanner(System.in);
    //WRMLListQueueBased w = new WRMLListQueueBased ();
    WRMArrayQueueBased w = new WRMArrayQueueBased ();
    Patient p1 = new Patient ("Todoroki", 21, "A+"); //id - 0
    Patient p2 = new Patient ("All Might", 31, "A+"); //id - 1
    Patient p3 = new Patient ("Deku", 16, "O+"); //id - 2
    Patient p4 = new Patient ("Uraraka", 15, "B+"); //id - 3
    Patient p5 = new Patient ("Yayorozo", 20, "O+"); //id - 4
    
/*----------------Reg. Process Start------------------*/   
    w.RegisterPatient (p1);
    w.RegisterPatient (p2);
    w.RegisterPatient (p3);
    w.RegisterPatient (p4);
    w.RegisterPatient (p5);
    w.ShowAllPatient ();
/*----------------Reg. Process END------------------*/   

    System.out.println ();
    System.out.println ("\n" + w.CanDoctorGoHome());
    System.out.println ();
    
/*----------------Serve Process Start------------------*/  
    w.ServePatient ();
    w.ServePatient ();
    w.ServePatient ();
    w.ServePatient ();
    w.ServePatient (); //all served
    w.ShowAllPatient ();
/*----------------Serve Process END------------------*/      
     
     //w.CancelAll();   //comment out the whole serve process to run this one.
     System.out.println ();
     System.out.println ("\n" + w.CanDoctorGoHome());
     System.out.println ();

 
  }
}