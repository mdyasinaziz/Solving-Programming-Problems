public class FootBallTeam extends Team {
    

    
    public FootBallTeam (String x, String y) {
        super (x,y);
    }
    
    public String toString () {
    return "Our name is " + name + "\nWe play Football";
    }
    
    public void getMascot() {
    System.out.print ("Our Football team mascot name is ");
    super.getMascot();
    }
}
    
    