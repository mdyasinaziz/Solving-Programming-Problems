public class Date {
    public int month = 0;
    public int date = 0;
    public int year = 0;
    
    public Date (int x, int y, int z){
    month = x;
    date = y;
    year = z;
    }
    
    public int getMonth () {
    return month;
    }
    
    public int getDate () {
    return date;
    }
    
    public int getYear () {
    return year;
    }
    
    public void displayDate (){
    System.out.println ("Entered Date was " + date + "/" + month + "/" + year);
    }
}