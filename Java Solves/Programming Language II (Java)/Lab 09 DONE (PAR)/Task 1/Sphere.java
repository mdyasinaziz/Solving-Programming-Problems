public class Sphere extends Point{
    public Sphere () {
    super (0);
    }
    
    public Sphere (double x){
        super (x);
    }
    
    public void makeSphere (){
    double area = 0.0;
    area = ((getRadius() *getRadius()*getRadius()) * 3.1416 * 4) / 3;
    System.out.println ("Creating a Sphere … done!");
    System.out.println ("The area of the Sphere is " + area);    
    }
}