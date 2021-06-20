public class Dog {
    public String color = "";
    
    public Dog (){
    }
    
    public Dog (String n){
        color = n;
    }
    
    public void changeColor (String j){
    color = j;
    }
    
    public void bark(){
    System.out.println (color + " dog is Barking");
    }
}