import java.util.*;
import java.util.io*;

public class FastIO{
public static void main (String [] args){
//obj like scanner, faster, no need for type casting 
	  BufferReader br = new BufferReader(new InputStreamReader(System.in));
	  String s = br.readLine();
	  System.out.println(s);

//String tokeniser have as input string and can separate the input stream into tokens
	StringTokenizer st = new StringTokenizer(s);
	while(st.hasMoreToken())
	  System.out.println(st.nextToken);
//initialise array using string tokeniizer
	int [] a = new int [3];
	while(st.hasMoreToken())
	  a[i]= Integer.parseInt(st.nextToken());
//display the arrat
	System.out.print(Arrays.toString(a));

//using other than space separate eg. when , is found
	StringTokenizer sr = new StringTokenizer(s,",");
	while(sr.hasMoreToken())
	  System.out.println(st.nextToken);
//StringBuilder takes no parameters  Using time less than using strings
	StringBuilder sb = new StringBuilder();
	sb.append("abc"); 
	// String sb = "abc";
	sb.append("def"); // now it contains "abcdef"
	sb.append(123); // sees 123 as a string
	sb.reverse();
//Arrays Sorting nlog(n)
	//10^5 algo complexity is n^2 >> slow program

	int [] a = new int [] {12,3,9};
	Arrays.sort(a); // sorts the array in ascending order
	System.out.println(Arrays.toString(a)); // to directly display the array
// Reverse Array
	 Arrays.sort(arr, Collections.reverseOrder());

	
	
	
	
}
}
