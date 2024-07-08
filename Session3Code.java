import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception{
		//(1)Prefix Sum
		//Given an array a of size 1<=n<=1e5 and q queries 1<=q<=1e5, each one consists of two indices
		// l and r (1<=l<=r<=n). You are required to find the sum a[l] + a[l+1] + ... + a[r]
		prefixSum();         //O(n+q)


		//You have an empty array a of size 1<=n<=1e5 
		//and q queries 1<=q<=1e5, each one consists of two indices l , r 1<=l<=r<=n and val (1 <= val <= 10^9). 
		//You are required the maximum element of the array after performing all the queries.
		prefSum2();
		
		//(2)All divisors of a number n
		//Given an integer n (1<=n<=1e12) print all divisors of n
		allDivisors();       //O(sqrt(n))
	}
	
	public static void prefixSum() throws Exception{
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
		int[] pref = new int[n] ;
		pref[0] = arr[0] ;
		for(int i=1 ; i<n ; i++) {
			pref[i] = arr[i] + pref[i-1];
		}
		while(q-- > 0) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			pw.println(pref[r] - ((l==0)?0:pref[l-1])) ;
		}
		pw.flush();
	}

	public static void prefixSum2() throws Exception{
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
		int[] pref = new int[n+1] ;
		while(q-- > 0) {
			int l = sc.nextInt()-1;
			int r = sc.nextInt()-1;
			pref[l]++;
			pref[r+1]--;
		}
		for(int i=1 ; i<n ; i++) {
			pref[i] = arr[i] + pref[i-1];
		}
	}
	
	public static void allDivisors() throws Exception{
		long n = sc.nextLong();
		for(long i=1; i*i<=n ; i++){
			if(n%i==0){
				pw.print(i+" ");
				if(i*i<n)
					pw.println(n/i);
			}
		}
		pw.flush();
			
	}
	
	public static void primeFactors() throws Exception{
		long n = sc.nextLong();
		for(long i=2; i*i<=n ; i++){
			if(n%i==0){
				pw.print(i+" ");
				int cnt=0;
				while(n%i==0){
					n= n/i;
					cnt++;
				}
				pw.println(cnt);
			}
		}
		if(n>1)
			pw.println(n+" "+1);
	pw.flush();
	}

	 public static long gcd(long a, long b){
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }


    //O(log(min(a,b))
    static long lcm(long a , long b){
        return a*b / gcd(a , b);
    }
	

}
