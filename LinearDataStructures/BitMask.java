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
    


    

    
    
  }
}
