public class sort{
//o(nlog(n))         max n: n^5/n^6
//o(n)                max n: n^7/n^6
public static void main (String[] args){
 
}

 
//merge sort O(n+m)
public static void mergeSort1 (int [] a, int [] b){
		int n = a.length, m = b.length;
	int[] res = new int[n+m];
	int i=0, j=0;
								for(int k=0; k<res.length;k++){
									if(i==n){ //a done
										res[k] = b[j];
										j++;
									}else if(j==m){ // b done
										res[k] = a[i];
										i++;
									}else {if(a[i]<=b[j]){ // a smaller
										res[k] = a[i];
										i++;
									}else{if(a[i]>b[j]){ // b smaller
										res[k] = b[j];
										j++;
									}
									}
								}
							} //for

}
public static void mergeSort2 (int [] a, int start, int end){
	if(start == end) return;
	int mid = (start +end )/2;
	mergeSort2(a, start , mid);
	mergeSort2(a,start, mid+1,end);
	merge(a, start, mid, end)	;
}
	

public static void merge(int [] a, int start, int mid, int end){
	int u = start, ue = mid+1, v = mid+1, ve= end+1;
	int n = end-start +1;
	int [] sort = new int[n];
	for(int i=0;i<n;i++){
		if(u == ue)
			sort[i] = array[v++];
		else if (v == ve)
			sort[i] = array[u++];
		else if (array[u]<= array[v])
			sort[i] = array[u++];
	}
	
}	
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
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
