public class Task13{
    public static int [] removeOdd (int [] input){
        int [] inputEven = new int [4]; 
        int j = 0;
        for (int i = 0; i < input.length; i++){
            if (input [i] % 2 == 0){
            inputEven [j] = input [i];
            j++;
            }
        }
        return inputEven;
    }
    public static void main(String [] args){
        int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
        for (int i = 0; i < mixedArray.length; i++) {
            System.out.print(mixedArray[i] + " ");
        }
        System.out.println();
        int [] noOdd = removeOdd(mixedArray);
        for (int i = 0; i < noOdd.length; i++) {
            System.out.print(noOdd[i] + " ");
        }    
    }
}
