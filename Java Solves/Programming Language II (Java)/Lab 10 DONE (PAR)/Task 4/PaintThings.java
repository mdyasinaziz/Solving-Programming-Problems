public class PaintThings {
    
    public static void main (String [] args){  
        Rectangle deck = new Rectangle (20.0, 35.0);
        Sphere bigBall = new Sphere (15.0);
        Cylinder tank = new Cylinder (10.0, 30.0);
        
        double deckArea = deck.area();
        double deckCover = 9;
        Paint forRecta = new Paint (deckArea, deckCover);
        System.out.println ("For Rectangle paint needed " + forRecta.areofShape());
        
        double bigBallArea = bigBall.area();
        double bigBallCover = 6;
        Paint forSphere = new Paint (bigBallArea, bigBallCover);
        System.out.println ("For Sphere paint needed " + forSphere.areofShape());
        
        double tankarea = tank.area();
        double tankCover = 7;
        Paint fortank = new Paint (tankarea, tankCover);
        System.out.println ("For Cylinder paint needed " + fortank.areofShape());
    }
}