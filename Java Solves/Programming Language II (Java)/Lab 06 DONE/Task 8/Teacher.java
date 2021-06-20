public class Teacher{
    String name;
    String dept;
    String cour;
    int x = 0;
    String [] arry = new String [10];
    
    public Teacher(String n, String d) {
        name = n;
        dept = d;
    }
    
    public void addCourse (Course j) { //Course j means j is a object of Course data (class)
    arry [x] = j.thecour; //since j is the object of Class Course so j.thecour means im getting the string of thecour 
                          //from the Course Class. 
    x++;
    }
    
    
    public void printDetail (){
        System.out.println ("========================");
        System.out.println ("Name: " + name);
        System.out.println ("Department: " + dept);
        System.out.println ("List of Courses");
        System.out.println ("========================");
        
        for (int i = 0; i < x; i++){
            System.out.println (arry[i]);
        }
        
        System.out.println ("========================");
    }
}