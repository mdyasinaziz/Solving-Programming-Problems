public class Rectangle extends Shape {
    public double length = 0.0;
    public double aria = 0.0;
    public double width = 0.0;
    
    public Rectangle (double x, double y){
    length = x;
    width = y;
    }
    
    public double area () {
    aria = length * width;
    return aria;
    }
}
    
    