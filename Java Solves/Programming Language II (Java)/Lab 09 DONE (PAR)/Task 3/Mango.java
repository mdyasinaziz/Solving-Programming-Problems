public class Mango extends Fruit{
    public String name = "Mango";
    public boolean ithasFormaline = true;

    public Mango(){
    super.name = name;
    }
    
    public boolean hasFormalin(){
        return ithasFormaline;
    }
     
    public String toString(){
    return "Mangoes are bad for you";
    }
}