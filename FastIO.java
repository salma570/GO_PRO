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
////initialise array using string tokeniizer
int [] a = new int [3];
while(st.hasMoreToken())
  a[i]= Integer.parseInt(st.nextToken());
//display the arrat
System.out.print(Arrays.toString(a));

//using other than space separate eg. when , is found
StringTokenizer sr = new StringTokenizer(s,",");
while(sr.hasMoreToken())
  System.out.println(st.nextToken);


//StringBuilder takes no parameters
StringBuilder sb = new StringBuilder();
sb.append("abc"); 
	// String sb = "abc";
sb.append("def"); // now it contains "abcdef"

// Using time less than using strings

}
}
