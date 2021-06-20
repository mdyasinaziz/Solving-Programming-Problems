import java.util.Scanner;
public class Test03{
    public static void main (String [] args){
        Scanner keyboard = new Scanner (System.in);
        System.out.println ("Please Enter Your Radius");
        float rad = keyboard.nextFloat();
        Double circumference = (2 * Math.PI * rad);
        Double area = ((Math.PI * (rad * rad)));
        System.out.println ("Circum is " + circumference);
        System.out.println ("Area is " + area);}
}
    
    