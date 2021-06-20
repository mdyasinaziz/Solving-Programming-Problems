public class task1d{
    public static void main (String [] args){
        int sign;
        sign = 1;
        for ( int n = 18 ; n <= 63 ; n= n+9 ){
            System.out.println ( sign * n );
            sign = sign * (-1);
        }
    }
}
            
            