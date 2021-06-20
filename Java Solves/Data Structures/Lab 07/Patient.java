public class Patient {
    String name;
    int age;
    String bloodgroup;
    public static int id = 0;
    int idTheirs = 0;
 
    
    public Patient(String n, int a, String b){
        this.name=n;
        this.age=a;
        this.bloodgroup=b;
        idTheirs = id;
        id++;
    }
}
