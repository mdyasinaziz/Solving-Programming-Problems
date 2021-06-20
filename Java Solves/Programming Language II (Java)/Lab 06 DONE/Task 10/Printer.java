public class Printer {
    
    
    public void printDetail (Student s){
    System.out.println ("Name of the Student: " + s.name);
    System.out.println ("ID of the Student: " + s.id);
    }
    
    public String printDetail2 (Student s){
    System.out.println ("Name of the Student: " + s.name);
    System.out.println ("ID of the Student: " + s.id);
    
    return s.name;
    }
}