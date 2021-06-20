import java.util.Scanner;
public class Task7 {
    public static void main (String args[]) {
        String s1 = "GII";
        String s2 = "DE";
        int result = s1.compareTo(s2); //compare kore diff between the two strings (ASCII value)
        System.out.println(result);
        
        String s3 = "Ab";
        String s4 = "abc";
        int result2 = s3.compareToIgnoreCase(s4);
        System.out.println(result2); //same as compareTo just ignnores upperlowercase letters
        
        String s5 = "Coding is Tedious";
        System.out.println(s5.startsWith("Cod")); //bole je the string starts with it or not 
        System.out.println(s5.endsWith("ous"));  ////bole je the string ends with it or not
        
        String s6 = "Lady Gaga";
        String s7 = "lady gag";
        System.out.println(s6.equals( s7 )); //are those the same
        System.out.println(s6.equalsIgnoreCase( s7 )); //are those the same (ignoring upperlowercase
        
        String s8 = "Unboxyourphone";
        String s9 = "o";
        System.out.println(s8.indexOf( s9 ));  //the location of the "o" in s8 string (first theke)
        System.out.println(s8.lastIndexOf( "o", 9 )); ////the location of the "o" in s8 string (last theke)
        
        String s10 = "Blue is the color";
        System.out.println(s10.replace( 'i' , 't' )); // replacement of strings
        
        String s11 = "Blue is the color";
        System.out.println(s10.substring( 10 )); // means 10 no index theke print howa shuru hbe string ta
        
        String s12 = "Habahobabloba";
        char [] a = s12.toCharArray();
        for (int i = 0 ;i < a.length - 1; i++){ //converting string to a char array
            System.out.print(a[i]);
        }
        
        System.out.println();
        String s13 = "ThAtsMaboIiii";
        System.out.println(s13.toLowerCase()); // converting the string to LowerCase
        System.out.println(s13.toUpperCase()); // converting the string to UpperCase
        
        String s14 = "    ThisLifeHasNoValue    ";
        System.out.println(s14.trim());  // cutting down the spaces between string and "
        
        char[] valueof = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        String s15 = "";
        s15 = s15.copyValueOf (valueof); // converting a charArray to String
        System.out.println(s15);
    }
}