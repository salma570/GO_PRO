import java.io.*;
import java.util.*;

public class Main{

  public static void main (String[] args) throws exception {
	int [] a = {1,3,4,6,10};

	// summation without using loops
	  int [] pref = new int [5];
	  pref[0] = a[0];
	  for(int i =1; i<5 ; i++){
		  pref[i] = pref[i-1]+a[i]; 
	  }
	  System.out.println(Arrays.toString(pref));
    //  get summation from  index 1 - index 4
	  //l = 3
	  //r = 4 
	  System.out.println(pref[4] - pref[3-1]);
	  


    
  }
}
