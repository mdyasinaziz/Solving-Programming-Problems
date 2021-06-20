public abstract class Shape {
    private String color = "";
    private boolean filled = false;
    
    public Shape (){}
    
    public Shape (String s, boolean j){
    color = s;
    filled = j;
    }
    
    public String getColor (){
    return color;
    }
    
    public void setColor (String g){
    color = g;
    }
    
    public boolean isFilled (){
    return filled;
    }
    
    public void setFilled (boolean k){
    filled = k;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
    
    public String toString (){
    return "In Shapes toString";
    }
}