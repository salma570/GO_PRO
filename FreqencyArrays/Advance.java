public class Main{
  public static void main(String [] args){

    // given an array find the frequency of each element
    // ranges of the numbers


    int [] freqArr = new int[(int)1e5+1];

    int n = sc.nextInt();
    for(int i =0; i<n;i++){
      freqArr[sc.nextInt()]++;
    }

    //10^9+ use hashmap for memory errors

    HashMap <long,Integer> freqMAp = new HashMAp<>();
    
 for(int i =0; i<n;i++){
   freqMap.put(sc.nextLong(), freqMap.getOrDefault(a,0)+1);
 }








    
  }
}
