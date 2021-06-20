public class ComplexNumber extends RealNumber {
    public double imagineValue;
    
    public ComplexNumber (){
        setRealValue(1.0);
        imagineValue = 1.0;
    }
    
    public String toString() {
        System.out.println(super.toString());
        return "Imaginary part: "+imagineValue;
    }
    
    public ComplexNumber (double d, double j){
        setRealValue(d);
        imagineValue = j;
    }
    
    public void check() {
        System.out.println("I'm in ComplexNumber class");
        ping();
        System.out.println("Check Ended");
    }
}

