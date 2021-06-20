public class Circle extends Shape {
    public double radius = 0.0;
    
    
    public Circle (){}
    
    public Circle (double f){
    radius = f;
    }
    
    public Circle (double f, String j, boolean g){
    radius = f;
    setColor(j);
    setFilled(g);
    }
    
    public double getRadius (){
    return radius;
    }
    
    public void setRadius (double m){
    radius = m;
    }
    
    public double getArea (){
        return 0.0;
    }
    
    public double getPerimeter (){
        return 0.1;
    }
    
    public String toString (){
    return "In Circles toString";
    }
}
    
    