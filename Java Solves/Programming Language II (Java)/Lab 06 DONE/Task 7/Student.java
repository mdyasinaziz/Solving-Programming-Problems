public class Student{
    public String name = "default name";
    public static int numberOfStudents = 3;
    
    public Student () {
    }
    
    public Student (String n) {
        name = n;
    }
    
    public String getName(){
    return name;
    }
}