public class Task10Main {

 public static void main(String[] args) {
  Task10Student s1 = new Task10Student();
  s1.setName("john");
  Task10Student s2 = new Task10Student();
  s2.setName("mike");
  Task10Student s3 = new Task10Student();
  s3.setName("carol");
  s1.setAddress("Mirpur");
  s2.setAddress("Mohakhali");
  s3.setAddress("Dhanmondi");
  s1.setId(17201019);
  s2.setId(17201049);
  s3.setId(17201010);
  s1.setCgpa(3.60);
  s2.setCgpa(3.94);
  s3.setCgpa(3.67);
  
  System.out.println ("Their details are as follows ");
  System.out.println (s1.getName());
  System.out.println (s2.getName());
  System.out.println (s3.getName());
  
  System.out.println (s1.getAddress());
  System.out.println (s2.getAddress());
  System.out.println (s3.getAddress());
  
  System.out.println (s1.getId());
  System.out.println (s2.getId());
  System.out.println (s3.getId());
  
  System.out.println (s1.getCgpa());
  System.out.println (s2.getCgpa());
  System.out.println (s3.getCgpa());
 }
}
