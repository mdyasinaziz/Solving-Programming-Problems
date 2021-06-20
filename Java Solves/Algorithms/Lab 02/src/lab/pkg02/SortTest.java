package lab.pkg02;
/**
 *
 * @author 17201019_Lab02
 */
public class SortTest {
    public static void main(String[] args) {
//        int [] arr = {3, 5 , 10, 23, 25, 8, 7, 9, 50, 47};
        int [] arr = {4,3,6,2};
        MyArray driver = new MyArray ();
        
//        int [] insertio = driver.insertionSort (arr);
//        driver.printArray (insertio);
//        
//        System.out.println (); System.out.println ();
//        
        int [] mergo = driver.mergeSort (arr);
        driver.printArray (mergo);
//        
//        System.out.println (); System.out.println ();
//        
//        int [] quicko = driver.quickSort (arr);
//        driver.printArray (quicko);
//        
//        System.out.println (); System.out.println ();
//        
//        int [] defa = driver.defaultSort (arr);
//        driver.printArray (defa);
    }
    
}