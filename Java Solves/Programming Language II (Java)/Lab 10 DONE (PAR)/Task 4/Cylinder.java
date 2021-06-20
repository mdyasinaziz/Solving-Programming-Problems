public class Cylinder extends Shape {
    public double radius = 0.0;
    public double height = 0.0;
    public double aria = 0.0;
    
    public Cylinder (double x, double y){
    radius = x;
    height = y;
    }
    
    public double area () {
    aria = 3.1416 * radius* radius * height;
    return aria;
    }
}
    
    