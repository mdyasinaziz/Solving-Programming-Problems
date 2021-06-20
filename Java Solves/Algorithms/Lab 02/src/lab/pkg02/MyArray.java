package lab.pkg02;

import java.util.Arrays;

/**
 *
 * @author 17201019_Lab02
 */
public class MyArray {

    static int[] globalArray;  //global array to not contradict the MAIN array.

    
    
    /*----------Insertion Sort Code----------*/
    public static int[] insertionSort(int[] ar) {
        double completion1 = System.currentTimeMillis();
        globalArray = copy(ar);
        for (int i = 1; i < globalArray.length; i++) {
            int key = globalArray[i];
            int j = i - 1;

            while (j >= 0 && globalArray[j] > key) {
                globalArray[j + 1] = globalArray[j];
                j = j - 1;
            }
            globalArray[j + 1] = key;
        }
        System.out.println(completion1);
        System.out.println ("Insertion");
        return globalArray;
    }
    /*----------E N D----------*/

    
    
    
    
    /*----------Merge Sort Code----------*/
    public static int[] mergeSort(int[] ar) {
        double completion2 = System.currentTimeMillis();
        globalArray = copy(ar);

        msort(globalArray, 0, globalArray.length - 1);

        System.out.println(completion2);
        System.out.println ("Merge");
        return globalArray;
    }

    // Main function that sorts arr[l..r] using 
    // merge() 
    public static void msort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point 
            int m = (l + r) / 2;
            System.out.println ("First " + l + " " + m + " " + r);
            // Sort first and second halves 
            msort(arr, l, m);
            System.out.println ("Second " +l + " " + m + " " + r);
            msort(arr, m + 1, r);
            System.out.println ("Thord " +l + " " + m + " " + r);
            // Merge the sorted halves 
            Mmerge(arr, l, m, r);
        }
    }

    public static void Mmerge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged 
        //System.out.println (l + " " + m + " " + r+"inside asdf");
        int n1 = m - l + 1; //here is m - L + 1 lol
        int n2 = r - m;
        //System.out.println (l + " " + m + " " + r+"inside "+ n1 + n2);
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j]; // here m plus one plus J lol
        }
        //System.out.println ("arraysare " +  + L[0] + " " +R [0]);
        /* Merge the temp arrays */
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0;

        // Initial index of merged subarry array 
        int k = l; //here it is L lol
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
//            System.out.println ("caame here" + k);
            k++;
        }
//        System.out.println (arr[1] + " " +k);
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
//        System.out.println (k + "k was" + j);
        /* Copy remaining elements of R[] if any */
        
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        //System.out.println (arr [1]+" haha "+ arr[2]);
        //printArray (arr);
    }
    /*----------E N D----------*/

    
    
    
    
    /*----------Quick Sort Code----------*/
    public static int[] quickSort(int[] ar) {
        double completion3 = System.currentTimeMillis();
        globalArray = copy(ar);
        qsort(globalArray, 0, globalArray.length - 1);
        System.out.println(completion3);
        System.out.println ("Quick");
        return globalArray;
    }

    /* The main function that implements QuickSort() 
     arr[] --> Array to be sorted, 
     low  --> Starting index, 
     high  --> Ending index */
    public static void qsort(int arr[], int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is  
             now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before 
            // partition and after partition 
            qsort(arr, low, pi - 1);
            qsort(arr, pi + 1, high);
        }
    }

    /* This function takes last element as pivot, 
     places the pivot element at its correct 
     position in sorted array, and places all 
     smaller (smaller than pivot) to left of 
     pivot and all greater elements to right 
     of pivot */
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element 
        for (int j = low; j < high; j++) {
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j] 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    /*----------E N D----------*/

    
    
    
    /*----------Default Sort Code----------*/
    public static int[] defaultSort(int[] ar) {
        double completion4 = System.currentTimeMillis();
        globalArray = copy(ar);
        Arrays.sort(globalArray);
        System.out.println(completion4);
        System.out.println ("Default");
        return globalArray;
    }
    /*----------E N D----------*/

    
    
    
    public static int[] copy(int[] lol) { //method for not contradicting
        globalArray = new int[lol.length];
        for (int i = 0; i < globalArray.length; i++) {
            globalArray[i] = lol[i];
        }
        return globalArray;
    }

    public static void printArray(int[] arr2) { //printing array
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

}