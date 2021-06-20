public class Task6{
    public static void main(String args[]){
        
        Task6BinarySearch ob = new Task6BinarySearch(); 
        int arr[] = {2,3,4,10,40}; 
        int x = 10; 
        //int result = ob.binarySearch(arr,x); 
        System.out.println(ob.binaryRecursionSearch(arr, x, 0, arr.length-1)); 
    }
}