public class Book extends Author {
    private String name = "Gitanjali";
    Author auth = new Author ();
    private double price = 0.0;
    private int qty = 0;
    
    public String getName(){
    return name;
    }
    
    public String getAuthor(){
    return auth.getName();
    }
    
    public double getPrice(){
    return price;
    }
    
    public void setPrice (double x) {
    price = x;
    }
    
    public int getQty(){
    return qty;
    }
    
    public void setQty (int j) {
    qty = j;
    }
    
    public String toString (){
        return name + " " + getAuthor() + "(" + getGender() + ")" + "at" + getEmail();
    }
}
    
    
    
    