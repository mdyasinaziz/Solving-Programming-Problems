public class Cat {
    public String color = "White";
    public String action = "Sitting";
    
    public Cat (){
    }
    
    public Cat (String n){
        color = n;
    }
    
    public Cat (String j, String x){
        color = j;
        action = x;
    }
    
    public void changeColor (String g){
    color = g;
    }
    
    public void printCat (){
    System.out.println (color + " cat is " + action);
    }
}