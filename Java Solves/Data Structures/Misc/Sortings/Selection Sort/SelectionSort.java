public class SelectionSort {
    public static void main (String [] args) {
        int [] arr = {6,8,9,5,4,10,13,12,11,7,3,2};
        for (int i = 0; i <= arr.length-2; i++){
            int min_idx = i; 
            for (int j = i+1; j <= arr.length-1; j++) {
                if (arr[j] < arr[min_idx]){ 
                    min_idx = j; 
                }
                int temp = arr[min_idx]; 
                arr[min_idx] = arr[i]; 
                arr[i] = temp; 
            } 
        }

        for (Object o : arr) {
            System.out.print (o + " ");
        }
    }
}