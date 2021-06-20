public class BinarySearch {
    
    int binarySearch(int arr[], int x){
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = (left + (right - left)/2); 
            if (arr[mid] == x){
               return 1; 
            }
            else if (x < arr[mid]){
               right = mid - 1;
            }
            else {
            left = mid + 1;
            }
        }
        return -1; 
        }
}