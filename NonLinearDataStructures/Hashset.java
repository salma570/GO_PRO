public class Hashset{
  public static void main(String [] args){
    //collection of data  no repititions unsorted 
    // all operations are O(1)
    HashSet<Integer> hset = new HashSet<>();
    HashSet<String> hset2 = new HashSet<>();
    
    hset.add(); // if you add the same elements a few times it only writes it once in the hashset
    hset.add(2);  hset.add(4);
    hset.remove(); // removes the element in the braket NOT THE INDEX
    // if you remove an element that doesn't exist does't give a runtime error

    hset.size();

    System.out.println(hset);
    System.out.println(hset.contains(5)); // returns boolean

//loop on hashset
    Iterator<Integer> it = hset.iterator();

    // can be used as string tokeniser next element
    while(it.hasNext()){
      System.out.println(it.next);
    }
//Method 2 like ArrayList >> For each
    for(Integer i : hset) {
      System.out.println(i);
    }    
  }
}
