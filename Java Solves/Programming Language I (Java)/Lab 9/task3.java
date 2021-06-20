public class task3{
    public static void main (String [] args){
        int i = 0;
        for (int n = 1 ; n <= 600; n = n+1){
            if (n % 7 == 0 && n % 9 == 0){
                i = i + n;
                System.out.println ( n );
            }
        }
    }
}