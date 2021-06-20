public class Task11Main {

 public static void main(String[] args) {
  Task11BankAccount s1 = new Task11BankAccount();
  s1.setName("acc1");
  Task11BankAccount s2 = new Task11BankAccount();
  s2.setName("acc2");
  Task11BankAccount s3 = new Task11BankAccount();
  s3.setName("acc3");
  s1.setAddress("Mirpur");
  s2.setAddress("Mohakhali");
  s3.setAddress("Dhanmondi");
  s1.setId(17201019);
  s2.setId(17201049);
  s3.setId(17201010);
  s1.setBalance(5000000.999);
  s2.setBalance(2000000.998);
  s3.setBalance(1000000.997);
  s1.setBalance(5000000.999);
  s2.setBalance(2000000.998);
  s3.setBalance(1000000.997);
  
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
  
  System.out.println (s1.getBalance());
  System.out.println (s2.getBalance());
  System.out.println (s3.getBalance());
  
  s1.addInterest();
  s2.addInterest();
  s3.addInterest();
 }
}
