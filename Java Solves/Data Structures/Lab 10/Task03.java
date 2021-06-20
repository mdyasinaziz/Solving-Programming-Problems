public class Task03 {
    public static void main (String [] args) {
        int [] arr = {10,20,30,40,50,60,0,0,0};
        int idx = 0;
        int x = printArrRecur (arr, idx);
    }
    
    public static int printArrRecur (int [] a, int idx) {
    if (idx == a.length) {return 1;}
    System.out.println (a [idx]);
    idx++;
    printArrRecur(a, idx);
    return -1;
    }
}