public class BitMask{
  public static void main(String [] args){
    boolean [] ba = new boolean [1000];
    Scanner sc = new Scanner (System.in);

    int n = sc.nextInt();
    while (n-->0){
      int c = sc.nextInt();
      ba[c] = true;
    }
    System.out.println(Arrays.toString(ba));
//is the same as 
    int n = sc.nextInt();
    while (n-->0){
      ba[sc.nextInt()] = true;
    }
    System.out.println(Arrays.toString(ba));

//operations to represent integer as a boolean array
// 1 represent true and 0 represents false
    int mask = 11; //use as an array saves up to 32 bit

    for(int i =0; i<32 ; i++){
      if((mask && (1<<i))!=0){
        System.out.print(1);
      }
      else{
        System.out.print(0);
      }
      
    }
    // check if 1 in position 1,0,3 respectively
    //(1<<1)  // 00000010
    // 1<<0   // 00000001
    // 1<<3    // 00000100

    // 000001010
    // 000001000 > 1<<3
    // 000001000 when anding both numbers
    // 1<<i depend on position of the 1 according to the array

//https://www.geeksforgeeks.org/what-is-bitmasking/
    //turn to zero 
    int mask1 = 46; 
    mask1 = mask1<<1; //multiply by powers of 2
    mask1 = mask1>>1; //divide by powers of 2

    int ns =0;
    // turn on
    ns = 1<<5;
    // turn off
    ns &= (1<<6);
//check if 5th bit is on or off
    System.out.println(s&(1<<5));
    boolean b = (s& (1<<5)) ==0; // if true yb2a offf
// XOR for toggling bits
    // 1^0 = 1       0^1 = 0
    // 0^0 = 0       1^1=0
// first least significant one > the first one mn el ymin
    //v 10001001 t =1
    // 010100100 t = 4 > 100
    //- s >> two's compliment of s
    int t = (s&(-s)); 
  }
  static int setBit(int S, int j) { return S | 1 << j; }
	static int clearBit(int S, int j) { return S & ~(1 << j); }
	static int toggleBit(int S, int j) { return S ^ 1 << j; }
	static boolean isOn(int S, int j) { return (S & 1 << j) != 0; }
	static int turnOnLastZero(int S) { return S | S + 1; }
	static int turnOnLastConsecutiveZeroes(int S) { return S | S - 1; }
	static int turnOffLastBit(int S) { return S & S - 1; }
	static int turnOffLastConsecutiveBits(int S) { return S & S + 1; }
	static int lowBit(int S) { return S & -S; }
	static int setAll(int N) { return (1 << N) - 1; }
	static int modulo(int S, int N) { return (S & N - 1); }		 //S%N, N is a power of 2
	static boolean isPowerOfTwo(int S) { return (S & S - 1) == 0; }
}
