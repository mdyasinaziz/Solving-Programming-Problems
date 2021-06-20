public class Task11BankAccount {
    String name;
    int id;
    String address;
    double balance;
    
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public int getId() {
        return id;
    }
    public void setId(int i) {
        id = i;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String a) {
        address = a;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double c) {
        balance = c;
    }
    
    public void addInterest() {
        balance = balance + (balance * 0.7);
        System.out.println (balance);
    }
}
