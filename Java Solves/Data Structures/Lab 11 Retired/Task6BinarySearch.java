public class Task6BinarySearch {
    
    
    public int binaryRecursionSearch (int arr[], int x, int start, int end){
        if (start == end) {
            if (arr [start] == x) return start;
            else return -1;
        }
        else {
            int mid = (start+end)/2;
            if (arr[mid] == x) {
                return mid;
            }
            else if ( x < arr [mid]) {
                return binaryRecursionSearch (arr, x, start, mid-1);
            }
            else {
                return binaryRecursionSearch (arr, x, mid+1, end);
            }
        }
    }
    
    
    
//    int binarySearch(int arr[], int x){
//        int left = 0;
//        int right = arr.length - 1;
//        
//        while (left <= right) {
//            System.out.println ((left+right)/2);
//            int mid = (left+right)/2; //(left + (right - left)/2); 
//            if (arr[mid] == x){
//               return 1; 
//            }
//            else if (x < arr[mid]){
//               right = mid - 1;
//            }
//            else {
//            left = mid + 1;
//            }
//        }
//        return -1; 
//        }
    
    
}