public class Paint {

    public double coverage = 0.0;
    public double painter = 0.0;
    public double area = 0.0;
    
    public Paint (double x, double y) {
    area = x;
    coverage = y;
    }
    
    public double areofShape (){
    painter = area / coverage;
    return painter;
    }

}