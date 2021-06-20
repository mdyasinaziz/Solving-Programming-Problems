public class CheckingAccount extends Account{
    public static int numberOfAccount = 3;
    
    public CheckingAccount () {
    super(0.0);
    }
    
    public CheckingAccount (double z) {
    super (z);
    }
    
    public void printBalance (){
    System.out.println ("Account nunu Balance: " + balance);
    }
}