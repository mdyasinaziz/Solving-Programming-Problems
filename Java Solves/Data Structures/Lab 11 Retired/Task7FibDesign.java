public class Task7FibDesign {
    public long [] fibArray;
    public Task7FibDesign (long [] a) {
    fibArray = a;
    }
        
        
        
    public long fibonacci(long n){
        long fibValue=0;
        if(n==0 ){
            return 0;
        }else if(n==1){
            return 1;
        }else if(fibArray[(int)n]!=0){
            System.out.println("Came Here");
            return fibArray[(int)n];
        }else{
            System.out.println("Came in Else");
            fibValue=fibonacci(n-1)+fibonacci(n-2);
            fibArray[(int) n]=fibValue;
            return fibValue;
        }
    }
    
}