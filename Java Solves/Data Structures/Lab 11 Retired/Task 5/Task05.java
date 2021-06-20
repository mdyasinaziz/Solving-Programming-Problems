public class Task05{
    public static void main (String[] args){
        Object[] num= {7,5,9,6,8,4,1,3,2};
        DoublyList list= new DoublyList(num);
        list.forwardprint();
         
        Object key;
        Node x, y;
         
         
        for (x=list.head.next; x!=null; x=x.next){
            for (y=x.prev; y!= null; y=y.prev){
                if ((Integer)y.element <= (Integer)y.next.element) break;
                key= y.element;
                y.element= y.next.element;
                y.next.element= key;
            }
        }
        list.forwardprint();
    }
//    for (int i=1; i<arr.length; i++) {
//            int key = arr[i]; 
//            int j = i-1; 
//
//            while (j>=0 && arr[j] > key){ 
//                arr[j+1] = arr[j]; 
//                j = j-1; 
//            }
//            arr[j+1] = key; 
//        }
}