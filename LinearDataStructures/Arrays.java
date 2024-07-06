import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		// (2) for each loop
		forEach();

		// (3)Arrays.sort
		arraysSort();

		// (4)Pair and sorting an array of Pairs
		PairMethod();

		// one last note
		// On comparing two "Longs" (the wrapper or non-primitive)
		// avoid using "==" and use instead:
		Long x = 3L;
		Long y = 3L;
		boolean condition = Long.compare(x, y) == 0;

	}

	
	public static void forEach() {
		int n = 5;
		int[] arr = new int[n];

		// the following two loops are equivalent

		for (int i = 0; i < n; i++) {
			// do sth with arr[i]
		}

		for (int x : arr) {
			// do sth with x
		}

		// if it were an array of Person(s)
		// then the loop will be
		// for(Person p : arr){
		// do sth with p
		// }
	}

	public static void arraysSort() {

		// we could use the predefined method Arrays.sort() to sort a given
		// array
		// Note: It sorts in a non-decreasing order

		int[] a = new int[5];
		Arrays.sort(a); // O(n^2) at worst case

		Integer[] b = new Integer[5];
		Arrays.sort(b); // O(n*log(n)) at worst case

		// same goes for long and Long

		// And if the type of elements in the array was any object (not a
		// primitive), it will run
		// in O(n*log(n)) at worst case

		// to reverse the order
		Arrays.sort(b, Collections.reverseOrder());
	}

	public static void PairMethod() {

		Pair[] arr = new Pair[4];
		arr[0] = new Pair(1, 2);
		arr[1] = new Pair(1, 3);
		arr[2] = new Pair(2, 3);
		arr[3] = new Pair(2, 1);

		Arrays.sort(arr); // uses the comparable criterion
		Arrays.sort(arr, Collections.reverseOrder()); // same but reverses order

		// different criteria of sorting

		// on x then y in a non-decreasing order
		Arrays.sort(arr, (a, b) -> (a.x == b.x) ? a.y - b.y : a.x - b.x);
		// on y then x in a non-decreasing order
		Arrays.sort(arr, (a, b) -> (a.y == b.y) ? a.x - b.x : a.y - b.y);
		// on the sum of x and y in a non-decreasing order
		Arrays.sort(arr, (a, b) -> (a.x + a.y) - (b.x + b.y));
	}

	static class Pair  { //implements Comparable<Pair>
		int x;
		int y;
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public String toString() {
			return "{" + this.x + ", " + this.y + "}";
		}
		//Override
		public int compareTo(Pair other) {
			// TODO Auto-generated method stub
			// sorts on x then y (in a non-decreasing order)
			return (this.x == other.x) ? this.y - other.y : this.x - other.x;
		}
	}
}
