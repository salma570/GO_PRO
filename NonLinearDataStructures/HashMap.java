// https://www.geeksforgeeks.org/hashset-in-java/ 
//https://www.geeksforgeeks.org/internal-working-of-hashmap-java/
//https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/

// hashset is an instanc ein the hashhmapp

public class HashMap{
  public static void main(String[] args){
    HashMap<String, Integer> hmap = new HashMap<>();

    // pair 2 elements og ammy types could e int int // int - str // str str keda
    // key cannot be reused el hwa the first key >> hena String : Mohamed mafish mnha 2 bs el int can be repeated
    //{"Mohamed": 1 , "Ahmed" :2, "s":2} 
    // not orderd

    hmap.put("vishal", 10);
    // Print size and content of the Map
    System.out.println("Size of map is: " + map.size());
    // Printing elements in object of Map
    System.out.println(map);

    hset.remove();
    hmap.containsKey(); //O(1)
    hmap.containsValues(); // O(the whole sey)
    hmap.get("Ahmed") // returns value of the given key O(2)

      // given an array of Strings find the occurance of each element of a given
    String [] a = new String[] {"salma","khaled","ahmed"};
    HashMap<String , Integer> occMap = New Hashmap<>();

    for(int i =0; i<a.length ; i++){
      if(occMap.contains(a[i])){
        occMap.put(a[i],occMap.get(a[i]+1));
      }else{
        occMap.put(a[i],1);
      }   
    }
// other method
  for(int i =0; i<a.length ; i++){
      occMap.put(a[i], occMap.getOrDefault(a[i],0)+1);
  }
// using for each print the hashmap
    for(inti : occMap.values()){
      System.out.println(i);
    }




    
  }
}
