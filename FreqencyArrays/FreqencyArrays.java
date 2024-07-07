
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {

		// (1) frequency array

		// given an array a of integers of size 1<=n<=1e5 and 1<=a[i]<=1e5,
		// print the number of occurences of all numbers from 1 to 1e5 in the
		// array
		freqArray1();
    
    // given a string of size n consisting only of lowercase latin characters,
		// print the number of occurences of all characters from 'a' to 'z'
		freqArray2();
    }
	
	public static void freqArray1() throws Exception {
	    Main.sc = new Main.Scanner(System.in);
      Main.pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int maxV = (int) 1e5 + 1;
		int[] freq = new int[maxV];
		for (int i = 0; i < n; i++) {
			freq[arr[i]]++;
		}
		
		for (int i = 1; i < maxV; i++) {
		    
			    pw.print(i+ ": " + freq[i] + " ");
			    
		}
		pw.println();
	}

  public static void freqArray2() throws Exception {
		Main.sc = new Main.Scanner(System.in);
    Main.pw = new PrintWriter(System.out);
    
    int n = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		
    int[] freq = new int[26];
		for (int i = 0; i < n; i++) {
			freq[arr[i] - 'a']++;
		}
		for (int i = 0; i < 26; i++) {
			pw.print(freq[i] + " ");
		}
		pw.println();
	}

	static Scanner sc ;
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
