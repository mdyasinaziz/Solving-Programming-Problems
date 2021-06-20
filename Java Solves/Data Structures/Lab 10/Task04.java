public class Task04{ 
    public static void main(String args[]) { 
        int dcmn = 100; 
        System.out.println(find(dcmn)); 
    }
    
    public static int find(int dcmn){
        if (dcmn == 0){ 
            return 0;  
        }
        else{
            return (dcmn % 2 + 10 * find(dcmn / 2)); 
        }
}
}