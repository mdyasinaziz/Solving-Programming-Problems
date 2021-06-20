class Task5{
    public static void main(String [] args){
    MyReader m = new MyReader();
         int x;
         try{
             x=m.readInteger();
             System.out.println("Input int was "+x);
         }
         catch(EitaIntegerNoiException e){
             System.out.println(e);
         }
     
   }
}