public class Task1 {
    public static void main (String [] args) {
        int [] a = {2,3,1,-2,0,-1,-3};
        for (int k = 0; k < a.length; k++) {
            rSelSort(a, k);
        }
        for (int k = 0; k < a.length; k++) {
            System.out.print (a[k] + " ");
        }
    }
    
    public static int minIdxFinder(int [] a, int i){
        if (i == a.length-1) {
        return i;
        }
        int rmi = minIdxFinder (a,i+1);
        if (a[i] < a [rmi]) {
        return i;
        }
        else {
        return rmi;
        }
    }
    public static void rSelSort (int []a , int i) {
        int mixIdx = minIdxFinder (a,i);
        if (mixIdx != i) {
        int temp = a[mixIdx];
        a[mixIdx] = a [i];
        a[i] = temp;
        }
    }
}
    