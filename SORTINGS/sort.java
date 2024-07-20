public class sort{


 
//O(n^2)
public static void bubbleSort (int [] array){
/* type 1 bubble sort algorithm > swap each 2 adjacent cells 

o(n^2)             max n: n^3
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
public static void selectionSort (int [] array){
   /*  2 selection sort algorithm > gets the smallest and sorts accordingly 
n + (n-1)+ (n-2)+..
o(n^2/2) = o(n^2)             max n: n^3
traverse once (n operations) : 1 5 4 3 2 6
traverse 2nd time (n operations) : 1 2 4 3 5 6
*/ 
   int n = array.length;
   for(int i =0; i<n;i++){
     int minval = array[i], minindex=i;
     for(int j=0; j<n;j++){
       if(array[j]<minval){
         minval = array[j];
         minindex = j;
       }
     }
     int temp = array[i];
     array[i] = minval;
     array[minindex] = temp;
   }
   
 }
public static void InsertionSort (int [] array){
/*  2 selection sort algorithm > sorts tracversed array : select  
the current elememnnt an dswitches it to the suitablel place  
1 + 2+4+ ... +(n-1)
o(n^2/2) = o(n^2)             max n: n^3
traverse once (n operations) : 5 6 4 3 2 1
traverse 2nd time (n operations) : 4 5 6 3 2 1
*/ 
 int n = array.length ;
 
 for(int i=0; i<n;i++){
  int temp = array[i]; j=i;
  while(j>0&& array[j-1]>array[j]){
      array[j] = array[j-1];
      array[j-1] = temp;
      j--; 
  }
 }
}
}
