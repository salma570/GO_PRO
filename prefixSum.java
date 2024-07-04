package Session3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class prefixSum {

	public static void main (String [] args) throws Exception {
		//(1)Prefix Sum
		
		//Given 
		//array a of size 1<=n<=1e5 
		//q queries 1<=q<=1e5, each one consists of two indices
		// l and r (1<=l<=r<=n). You are required to find the sum a[l] + a[l+1] + ... + a[r]
		prefixSum1();         //O(n+q)
		
	}
	public static void prefixSum1() throws Exception{
		//prefixSum is the file name yea
		prefixSum.sc = new prefixSum.Scanner(System.in);
		prefixSum.pw = new PrintWriter(System.out);
		
		int n = 3;
		int q = 2;
		//int[] arr = new int[n];
		/*
		//initialise array 
		for(int i=0 ; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
		*/
		int [] arr = new int[] {1,2,3};
		
		//fill the prefix sum array
		int[] pref = new int[n] ;
		pref[0] = arr[0] ;
		
		for(int i=1 ; i<n ; i++) {
			pref[i] = arr[i] + pref[i-1];
		}
		
		
		while(q-- > 0) {
			System.out.print("enter l ane r");
			int l = sc.nextInt()-1;
			int r = sc.nextInt()-1;
			pw.println(pref[r] - ((l==0)?0:pref[l-1])) ;
			pw.flush();
		
		}
		
		pw.flush();
		pw.close();
	}
	
	
	
	//static scanner custom class
	static Scanner sc;
	static PrintWriter pw;

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(String r) throws Exception {
			br = new BufferedReader(new FileReader(new File(r)));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			String x = next();
			StringBuilder sb = new StringBuilder("0");
			double res = 0, f = 1;
			boolean dec = false, neg = false;
			int start = 0;
			if (x.charAt(0) == '-') {
				neg = true;
				start++;
			}
			for (int i = start; i < x.length(); i++)
				if (x.charAt(i) == '.') {
					res = Long.parseLong(sb.toString());
					sb = new StringBuilder("0");
					dec = true;
				} else {
					sb.append(x.charAt(i));
					if (dec)
						f *= 10;
				}
			res += Long.parseLong(sb.toString()) / f;
			return res * (neg ? -1 : 1);
		}

		public Long[] nextLongArray(int n) throws IOException {
			Long[] a = new Long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public int[] nextIntArray(int n) throws IOException {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public Integer[] nextIntegerArray(int n) throws IOException {
			Integer[] a = new Integer[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public boolean ready() throws IOException {
			return br.ready();
		}
	}


}
