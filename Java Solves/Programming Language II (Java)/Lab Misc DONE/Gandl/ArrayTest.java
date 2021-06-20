public class ArrayTest {
    public static void main (String [] args){
        int x [] [] [] = {
              {{1, -2, 3},{2, 3, 4}}, 
              {{-4, -5, 6, 9},{1},{2, 3}}
        };
        
        Testinside (x);
    }
    public static void Testinside (int z [] [] []) {
        System.out.println(z [1] [0] [0]);               
    }      
}