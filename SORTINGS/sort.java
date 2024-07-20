public class sort{
  
  public static void bubbleSort (int [] array){
/* type 1 bubble sort algorithm > swap each 2 adjacent cells 

o(n^2)             max n: n^3/n^4
traverse once (n operations) : 5 4 3 2 1 6
traverse 2nd time (n operations) : 4 3 2 1 5 6
*/   
    int n = array.length;
    boolean flag = false;
    
    for(int i =0; i<n ; i++){
      flag = true;
      
      for(int j =0; j<n-1;j++){
        if(array[j+1]<array[j]){
          int temp = array[j+1];
          array[j+1] = array[j];
          array[j] = temp;
          flag = false;
        }
      }
      if(flag) break;
    }
  }

 public static void bubbleSort (int [] array){
   //o(nlog(n))         max n: n^5/n^6
 }







    
    
    //o(n)                max n: n^7/n^6
  }
}
