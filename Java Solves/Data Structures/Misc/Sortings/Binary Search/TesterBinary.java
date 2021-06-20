public class TesterBinary{
    public static void main(String args[]){
        
        BinarySearch ob = new BinarySearch(); 
        int arr[] = {2,3,4,10,40}; 
        int x = 11; 
        int result = ob.binarySearch(arr,x); 
        System.out.println(result); 
    }
}