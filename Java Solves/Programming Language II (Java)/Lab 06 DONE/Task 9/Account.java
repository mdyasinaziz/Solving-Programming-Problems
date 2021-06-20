public class Account {
    String name = "Default Account";
    double balan = 0.0;
    public static double interestRate = 5.0;
    
    public Account (){
    }
    
    public Account (String q, double j){
        name = q;
        balan = j;
    }
    
    public String nameKi(){
        return name;
    }
    public double balanceKi (){
        return balan;
    }
    
    public void nameBoshao (String k){
        name = k;
    }
    public void balanceBoshao (double x){
        balan = x;
    }
    
    public void withdraw(double h){
        if ((balan - h) <= 100 ){
            System.out.println ("Can't Withdraw, to less");
        }
        else {
            balan = balan - h;
            System.out.println ("Withdraw Success!" + "New Balance is: "+ balan );
        }
    }
}




