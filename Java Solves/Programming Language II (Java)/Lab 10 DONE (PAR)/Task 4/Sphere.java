public class Sphere extends Shape {
    public double radius = 0.0;
    public double aria = 0.0;
    
    public Sphere (double x){
    radius = x;
    }
    
    public double area () {
    aria = 4 * 3.1416 * radius * radius;
    return aria;
    }
}
    
    