public class Rectangle extends Shape {
    public double width = 0.0;
    public double length = 0.0;
    
    public Rectangle (){}
    
    public Rectangle (double f, double k){
    width = f;
    length = k;
    }
    
    public Rectangle (double f, double k, String j, boolean g){
    width = f;
    length = k;
    setColor(j);
    setFilled(g);
    }
    
    public double getWidth (){
    return width;
    }
    
    public void setWidth (double g){
    width = g;
    }
    
    public double getLength (){
    return length;
    }
    
    public void setLength (double g){
    length = g;
    }
    
    public double getArea (){
        return 1.0;
    }
    
    public double getPerimeter (){
        return 1.1;
    }
    
    public String toString (){
    return "In Rectangle toString";
    }
}