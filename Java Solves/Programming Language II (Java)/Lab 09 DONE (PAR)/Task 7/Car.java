public class Car { 
    public static int carCount = 0;
    public int year = 0;
    
    public Car () {
    carCount = carCount + 1;
    }
    
    public Car (int z) {
    year = z;
    carCount = carCount + 1;
    }
    
    public static int getObjectCount(){
    return carCount;
    }
    
    /*public int getObjectCount () {
        carCount++;
        return carCount; 
    }*/
    
    public int getYear() {
        return year;
    }
}