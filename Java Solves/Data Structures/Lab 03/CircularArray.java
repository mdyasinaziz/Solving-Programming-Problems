public class CircularArray{
  
  private int start;
  private int size;
  private Object [] cir;
  
  /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
   */
  public CircularArray(Object [] lin, int st, int sz){
    cir = new Object [lin.length];
    size = sz;
    start = st;  
    for (int i = 0; i < cir.length; i++){
        cir [(start+i) % cir.length ] = lin [i];
    }  
  }
  
  //Prints from index --> 0 to cir.length-1
  public void printFullLinear(){
      for (int i = 0; i < cir.length; i++){
      System.out.println (cir[i]);
      }
      System.out.println ();
  }
  
  // Starts Printing from index start. Prints a total of size elements
  public void printForward(){
      //int k = start;
      for (int i = 0; i < size; i++) {
      System.out.println (cir [(start+i) % cir.length]);
      //k = (k+1) % cir.length;
      }
      System.out.println ();
  }
  
  
  public void printBackward(){
   for (int i = size-1; i >= 0; i--){
      System.out.println (cir [(start+i) % cir.length]);
      }
      System.out.println ();
  }
  
  // With no null cells
  public void linearize(){
      Object [] liner = new Object [cir.length];
      for (int i = 0; i < liner.length; i++){
      liner [i] = cir [(start+i) % cir.length];
      }
      cir = new Object [size];
      for (int i = 0; i < cir.length; i++){
      cir [i] = liner [i];
      }
      System.out.println ();
  }
  
  // Do not change the Start index
  public void resizeStartUnchanged(int newcapacity){
    Object [] liner = new Object [cir.length];
      for (int i = 0; i < cir.length; i++){
      liner [i] = cir [(start+i) % cir.length];
      }
      
      cir = new Object [newcapacity]; int st = 0;
      for (int i = start; i < size+start; i++) {
      cir [i] = liner [st];
      st++;
      }
  }
  
  // Start index becomes zero
  public void resizeByLinearize(int newcapacity){
    Object [] liner = new Object [cir.length];
      for (int i = 0; i < cir.length; i++){
      liner [i] = cir [(start+i) % cir.length];
      }
      
      cir = new Object [newcapacity]; int st = 0;
      for (int i = 0; i < size; i++) {
      cir [i] = liner [st];
      st++;
      }
  }
  
  /* pos --> position relative to start. Valid range of pos--> 0 to size.
   * Increase array length by 3 if size==cir.length
   * use resizeStartUnchanged() for resizing.
   */
  public void insertByRightShift(Object elem, int pos){
Object [] liner = new Object [cir.length]; int counter = 0;
      for (int i = 0; i < liner.length; i++){
      liner [i] = cir [(start+i) % cir.length];
      }
      if (cir.length == size) {
      cir = new Object [cir.length+3];
      }
      int k = start;
      for (int i = 0; i < size+1; i++) {
      if (i == pos) { cir [k] = elem; counter++; }
      else { cir [k] = liner [i-counter]; }  
      k = (k+1) % cir.length;
      }      
  }
  
  public void insertByLeftShift(Object elem, int pos){
      int counter = 1;
      for (int i = 1; i < cir.length; i++) {
          if ( i == pos+start){ cir [i] = elem; counter--; }
          else {
              cir [i] = cir [i+counter];
          }
          }
      start--; 
      size = size+2;
  } 
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
    public void removeByLeftShift(int pos){
        Object [] liner = new Object [cir.length]; int counter = 0;
        for (int i = 0; i < liner.length; i++){ 
            liner [i] = cir [(i+start) % cir.length];   
        }
        for (int i = 0; i < cir.length; i++) {
            if (i == pos) { liner [i] = null; counter++;}
            else { liner [i-counter] = liner [i]; }
        } 
        for (int i = 0; i < liner.length; i++){ 
            cir [(i+start) % cir.length] = liner [i];   
        }
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByRightShift(int pos){
    int st = start;
    st = st + pos; 
      Object [] liner = new Object [cir.length];
      for (int i = 0; i < liner.length; i++){ 
              liner [i] = cir [i];   
          }
    
    for (int i = 4; i < cir.length; i++){ 
        cir [i] = liner [i-1];   
          }
    cir [pos] = null;
  }
  
  
  //This method will check whether the array is palindrome or not
  public void palindromeCheck(){
    Object [] liner = new Object [size];
      for (int i = 0; i < size; i++){ 
              liner [i] = cir [(start+i) % cir.length];   
          }
      int len = liner.length-1; boolean b = false;
      for (int i = 0; i < liner.length / 2; i++){ 
          if (liner [i] == liner [len]) {
          b = true; 
          }
          else {
          b = false; 
          }
          len--;
          }
      if (b == true) { System.out.println ("Yes it is a palindrome ");}
      else {System.out.println ("No it is not a palindrome ");}
  }
  
  
  //This method will sort the values by keeping the start unchanged
  public void sort(){
      Object [] liner = new Object [size]; int temp;
      for (int i = 0; i < size; i++){
      liner [i] = cir [(start+i) % cir.length];
      }
      cir = new Object [liner.length];
      for (int i = 0; i < cir.length; i++){
      cir [i] = liner [i];
      }
      for (int i = 0; i < cir.length; i++) {
          for (int j = i + 1; j < cir.length; j++) {
              if ((int)cir[i] > (int)cir[j]) {
                  temp = (int)cir[i];
                  cir[i] = cir[j];
                  cir[j] = temp;
              }
          }
      }
      start = 0;
  }
  
  //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
  public boolean equivalent(CircularArray k){
      {
          int m, n ;
          for (int i = 0; i < size; i++) {
              m = (start+i)%cir.length;
              n = (k.start+i)%k.cir.length;
              if(cir[m]!=k.cir[n]) {
                  return false;
              }   
          }
          return true;
      }
  }
}
