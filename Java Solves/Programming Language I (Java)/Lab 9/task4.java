public class task4{
    public static void main (String [] args){
        
        for (int n = 0 ; n <= 600; n = n+1){
            if (!(n % 7 == 0 && n % 9 == 0)){
                if (n % 7 == 0) {
                    System.out.println (n);
                } else if (n % 9 == 0) {
                    System.out.println (n);
                }
            }
        }
    }
}