package lab.pkg12;
/**
 *
 * @author 17201019
 */
import java.util.*; 
  
public class Hash_Table_Demo {
public static void main(String[] args){
  
        // Creating an empty Hashtable 
        Hashtable<Integer, String> hash_table =  
        new Hashtable<Integer, String>(); 
        Scanner sc = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        Scanner sc3 = new Scanner (System.in);
        
        for (int i = 0; i >= 0; i++) {
        System.out.println ("Press 1 to Insert\nPress 2 to Delete\n\nPress 3 to Find\nPress 0 to Break");
        int input = sc.nextInt();
       
        
        if (input == 0) { break; }
        
        if (input == 3) {
            System.out.println("FINDD?");
            String find = sc3.nextLine();
            System.out.println ("Found " + hash_table.get(find));
        }
        
        
        int input2=0; 
        String input3="";
        if (input == 1) {
        System.out.println ("Number?");
        input2 = sc.nextInt();
        System.out.println ("\nName?");
        input3 = sc2.nextLine();
        hash_table.put(input2, input3); 
        }
        
        
        if (input == 2) {
        System.out.println ("Delete?");
        int input4 = sc.nextInt();
        System.out.print ("REMOVED!");
        String returned_value = (String)hash_table.remove(input4); 
        }
        
        
        }
        System.out.println("New table is: " + hash_table); 
        
        
    }
}