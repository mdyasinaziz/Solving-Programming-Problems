package assignment.pkg02;
/**
 *
 * @author 17201019_Assignment02
 */
public class Assignment02 {
    public static void main(String[] args) {
        System.out.println ("Initializing Array...\n");
        
        int [] array = {2,3,6,4,5,7,8,9,1,0,5,3,6,7};
        
        System.out.println ("Sorting Array Using Merge Sort.\n");
        
        msort(array, 0, array.length - 1);
        
        System.out.println ("Sort Using Merge Sort Complete!\n");
        
        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1) {System.out.print (array [i] + ".  ");}
            else System.out.print (array [i] + ",");
        }
    }

    // Main function that sorts arr[l..r] using merge combination.
    public static void msort(int arr[], int l, int r) {
        if (l < r) {
            // Finding the middle point 
            int m = (l + r) / 2;

            // Sort first and second halfs reccurisvely 
            msort(arr, l, m);
            msort(arr, m + 1, r);

            // Merge the sorted halfs ofc. 
            Mmerge(arr, l, m, r);
        }
    }

    public static void Mmerge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }

        /* Merge the temp arrays */
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0;

        // Initial index of merged subarry array 
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
}
    