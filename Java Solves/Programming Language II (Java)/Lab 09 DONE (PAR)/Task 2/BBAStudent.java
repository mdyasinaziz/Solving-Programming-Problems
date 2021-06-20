public class BBAStudent extends Student{
    public String name = "Default BBA Student";
    public String department = "BBA";
    public BBAStudent () {
        setDepartment(department);
        setName(name);
        this.toString(); 
    }
    
    public BBAStudent (String z) {
        setName(z);
        setDepartment(department);
        this.toString();
    }
}
