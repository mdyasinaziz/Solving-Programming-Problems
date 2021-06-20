public class Square extends Rectangle {
    public double side = 0.0;
    
    public Square (){}
    
    public Square (double f){
    side = f;
    }
    
    public Square (double f, String j, boolean g){
    side = f;
    setColor(j);
    setFilled(g);
    }
    
    public double getSide(){
    return side;
    }
    
    public void setSide(double k){
    side = k;
    }
    
    public void setWidth (double q) {
    width = q;
    }
    
    public void setLength (double s) {
    length = s;
    }
    
    public String toString (){
    return "In Square toString";
    }
}