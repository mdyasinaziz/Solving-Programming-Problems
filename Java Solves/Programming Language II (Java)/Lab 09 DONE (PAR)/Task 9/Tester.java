public class Tester {
    public static void main (String [] args){
        
        Guitar g = new Keyboard ();
        Keyboard k = new Keyboard ();
        Violin v = new Violin ();
        
        g.play();
        k.play();
        v.play();
        
        g.adjust();
        k.adjust();
        v.adjust();
        
        g.compose();
        k.compose();
        v.compose();
    }
}