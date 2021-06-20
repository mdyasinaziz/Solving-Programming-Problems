public class InsertionSort {
    public static void main (String [] args) {
        int [] arr = {6,8,9,5,4,7,3,2};
        for (int i=1; i<arr.length; i++) {
            System.out.println ("Came Her for you mate <3");
            int key = arr[i]; 
            int j = i-1; 

            while (j>=0 && arr[j] > key){ 
                arr[j+1] = arr[j]; 
                j = j-1; 
            }
            arr[j+1] = key; 
        }
        
        for (int i:arr) {
        System.out.println (arr[i-2]);
        }
    }
}