import java.util.Scanner;
public class Task8{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int[] a = new int [10];
        int one = 0;
        int  two = 0;
        int three= 0;
        int four = 0;
        int  five = 0;
        int six= 0;
        int seven = 0;
        int  eight = 0;
        int nine= 0;
        int zero = 0;
        
        for (int i = 0 ; i < a.length; i++){
            System.out.println ("Please Enter a number Between 0 to 9");
            a[i] = sc.nextInt(); 
        } //loop for taking numbers^
        
        for (int j = 0; j < a.length ; j++){
            if(a[j] == 0) {
                zero++;
            }
            if(a[j] == 1) {
                one++;
            }
            if(a[j] == 2) {
                two++;
            }
            if(a[j] == 3) {
                three++;
            }
            if(a[j] == 4) {
                four++;
            }
            if(a[j] == 5) {
                five++;
            }
            if(a[j] == 6) {
                six++;
            }
            if(a[j] == 7) {
                seven++;
            }
            if(a[j] == 8) {
                eight++;
            }
            if(a[j] == 9) {
                nine++;
            }
        } //loop for checking which number is how many times inputed^
        
        if ( nine >= 2 &&  nine <= 4) {
            System.out.println ("9");
        }
        if ( eight >= 2 &&  eight <= 4) {
            System.out.println ("8");
        }
        if ( seven >= 2 &&  seven <= 4) {
            System.out.println ("7");
        }
        if ( six >= 2 &&  six <= 4) {
            System.out.println ("6");
        }
        if ( five >= 2 &&  five <= 4) {
            System.out.println ("5");
        }
        if ( four >= 2 &&  four <= 4) {
            System.out.println ("4");
        }
        if ( three >= 2 &&  three <= 4) {
            System.out.println ("3");
        }
        if ( two >= 2 &&  two <= 4) {
            System.out.println ("2");
        }
        if ( one >= 2 &&  one <= 4) {
            System.out.println ("1");
        }
        if ( zero >= 2 &&  zero <= 4) {
            System.out.println ("0");
        }
        //Checking which number was inputed at least twice and less than 5 times^
    }
}






