public class Circle extends Point{
    public Circle () {
    super (0);
    }
    
    public Circle (double x){
        super (x);
    }
    
    public void makeCircle (){
    double area = 0.0;
    area = ((getRadius() *getRadius()) * 3.1416);
    System.out.println ("Creating a Circle … done!");
    System.out.println ("The area of the Circle is " + area);    
    }
}
    
    
/*Sample Input/Output
Enter radius of Circle: 5
Creating a Circle … done!
The area of the Circle is 78.539816339744830961566084581988
Enter radius of Sphere: 7
Creating a Sphere … done!
The area of the Sphere is 205.25072003453315824622603437426 */        